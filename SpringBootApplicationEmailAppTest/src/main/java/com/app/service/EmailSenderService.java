package com.app.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.AbstractResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component; 

@Component public class EmailSenderService { 
	@Autowired  private JavaMailSender sender; 

	public boolean send(String to,    String subject,    String text,     AbstractResource file){ 


		boolean issent=false; 
		try {   
			//1. create Message  
			MimeMessage message=sender.createMimeMessage();    
			//2. provide details    //true=>allocate memory for attachment 
			MimeMessageHelper helper=new MimeMessageHelper(message, file!=null);   
			helper.setTo(to);    
			helper.setSubject(subject);    
			if(text!=null)     
				helper.setText(text);    
			if(file!=null)    
				helper.addAttachment(file.getFilename(), file);    
			//3. send message    
			sender.send(message);    
			issent=true;   
		} 
		catch (Exception e) {
			issent=false;
			e.printStackTrace(); 
		} 
		return issent; 
	}


	/***   * over loaded methods   *    */ 
	public boolean send(    String to,    String subject){  
		return send(to,subject,null,null); 
	} 

	public boolean send(    String to,    String subject,    String text) { 
		return send(to,subject,text,null); 
	} 
}