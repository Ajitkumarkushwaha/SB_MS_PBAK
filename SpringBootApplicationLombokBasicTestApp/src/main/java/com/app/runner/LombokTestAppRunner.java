package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.test.LombokTest;

@Component
public class LombokTestAppRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
	
		LombokTest lt = new LombokTest(10, "Hi");
		lt.setEid(12);
		lt.setEname("Hi");
		System.out.println(lt.getEname());
		
		
	}
}
