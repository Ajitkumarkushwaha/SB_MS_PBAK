package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataReadRunner implements CommandLineRunner {

	@Value("${message}")
	private String msg;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("From DataRead Runner");
		System.out.println(msg);
	}

}
