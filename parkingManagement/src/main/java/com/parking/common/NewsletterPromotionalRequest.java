package com.parking.common;

public class NewsletterPromotionalRequest {
	private String recipients;
	private String subject;
	private String mailbody;

	public void setRecipients(String recipient) {
		this.recipients=recipient;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setMailbody(String mailbody) {
		this.mailbody = mailbody;
	}

	
	public String getRecipients() {
		return recipients;
	}
	public String getSubject() {
		return subject;
	}
	public String getMailbody() {
		return mailbody;
	}

	
	public boolean validate(){
		return true;
	
	}
}
