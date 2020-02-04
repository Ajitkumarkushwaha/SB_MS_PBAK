package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.app.service.EmailSenderService; 

@Component 
public class MailTestRunner   implements CommandLineRunner {
	@Autowired  
	private EmailSenderService service;   
	@Override  
	public void run(String... args) throws Exception {  
		FileSystemResource file=new FileSystemResource("E:\\Redmi Mobile\\Creative\\ajit.jpg");  
		boolean sent=service.send("naa.ajitkumar@gmail.com", "Welcome", "Hello all!!", file); 
		if(sent)   
			System.out.println("done");
		else    System.out.println("not");    
		}   
	} 
 

