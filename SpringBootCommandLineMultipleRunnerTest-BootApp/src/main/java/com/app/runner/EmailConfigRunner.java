package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class EmailConfigRunner implements CommandLineRunner, Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Email Config Test Application With Ordered Interface Test Purpose");
	}
	@Override
	public int getOrder() {
		
		return 3;
	}

}
