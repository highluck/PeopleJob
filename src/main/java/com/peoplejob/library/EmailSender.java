package com.peoplejob.library;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;

import com.peoplejob.dto.auth.Email;


public class EmailSender implements Runnable {

	 @Autowired
	 private JavaMailSender mailSender;
	 private Email email;
	  
     public void setEmail(Email email) throws Exception {        
    	 this.email = email;
     }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		MimeMessage msg = mailSender.createMimeMessage();   
				System.out.println("보냄");
		try {
				msg.setSubject(email.getSubject());
				msg.setText(email.getContent());
				msg.setRecipients(MimeMessage.RecipientType.TO , InternetAddress.parse(email.getReceiver()));
				mailSender.send(msg);
				System.out.println("받음");
			} catch (MessagingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}     
	}
}
