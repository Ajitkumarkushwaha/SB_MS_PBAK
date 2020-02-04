package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DataReadRunner implements CommandLineRunner {

	@Autowired
	private  Environment env;
	@Override
	public void run(String... args) throws Exception {
		int id= env.getProperty("id", Integer.class);
		String code = env.getProperty("code");
		double cost = env.getProperty("cost", Double.class);
		System.out.println(id);
		System.out.println(code);
		System.out.println(cost);
	}

}
