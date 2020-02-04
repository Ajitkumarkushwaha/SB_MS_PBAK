package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class JdbcConfigRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("JdbcConfig Runner Test Application");
	}

}
