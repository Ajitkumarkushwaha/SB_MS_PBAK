package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	@Value("${eid}")
	private int code;
	@Value("${ename}")
	private String name;
	@Value("${esal}")
	private double sal;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(code);
		System.out.println(name);
		System.out.println(sal);
	}

}
