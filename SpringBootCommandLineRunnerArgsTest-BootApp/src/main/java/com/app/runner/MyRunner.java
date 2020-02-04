package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome In Command Line Argument Test App");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println("By By!!!");
		System.out.println("Virtual Machine Or System Args");
		String s = System.getProperty("title");
		System.out.println(s);
	}

}
