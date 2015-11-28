package com.parking.Model.Services.Contract;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface MailService {
	public String status();
	public void sendEmail() throws AddressException, MessagingException;
}