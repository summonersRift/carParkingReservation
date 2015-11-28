package com.parking.Model.Services;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import com.parking.Model.Services.Contract.MailService;

public class MailServiceImp implements MailService{
 
	private String[] recipients;
	private String subject;
	private String email;
	int total=0;
	int delivered=0;
	
	//For  mail service
	static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;
	
	
	public MailServiceImp(String receiver, String sub, String content, boolean send){
		System.out.println("Marketing Controller: constructor of mail service");
		recipients = receiver.split(",");
		subject = sub;
		email = content;
		total=recipients.length;
		System.out.println("     recepients: "+recipients.toString()+", Email subject: "+subject+", Email Content: "+email);
		if (send==true){
			try {
				System.out.println("Total recepietns: "+recipients.length);
				sendEmail();
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//message sent
		else
			System.out.println("!!!Marketing Controller: constructor created, message not sending!");
		
	}
	public String status(){
		String st = "Requested Email: "+total +"Sent:"+delivered;
		return st;
	}
	
	@Override
	public void sendEmail() throws AddressException, MessagingException {
		// Step1
		System.out.println("\n 1st ===> setup Mail Server Properties..");
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
		System.out.println("Mail Server Properties have been setup successfully..");
 
		// Step2
		System.out.println("\n\n 2nd ===> get Mail Session..");
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		
		
		for (int i =0; i<recipients.length; i++)
		{
			generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipients[i]));
			//generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("obaida007@gmail.com"));
			generateMailMessage.setSubject(subject);
			//String emailBody = "Test email for marketing of car parking reservation " + "<br><br> Regards, <br>PMS marketing offficial";
			generateMailMessage.setContent(email, "text/html");
			System.out.println("Mail Session has been created successfully for: "+recipients[i]);
	 
			// Step3
			System.out.println("\n\n 3rd ===> Get Session and Send mail");
			Transport transport = getMailSession.getTransport("smtp");
	 
			// Enter your correct gmail UserID and Password
			// if you have 2FA enabled then provide App Specific Password
			transport.connect("smtp.gmail.com", "pms.fiu@gmail.com", "pms123456");
			//transport.connect("mail.obaida.info", "pms@obaida.info", ";ga={;!]C!3=");			
			transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
			transport.close();
			delivered++;
		}
		System.out.println("Delivered Status, total: "+total+", delivered: "+delivered);

	}
}