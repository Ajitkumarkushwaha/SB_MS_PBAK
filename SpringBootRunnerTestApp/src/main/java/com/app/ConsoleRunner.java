package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	public void run(String ... args)throws Exception{
		System.out.println("Welcome To Boot !!!");
	}

}
