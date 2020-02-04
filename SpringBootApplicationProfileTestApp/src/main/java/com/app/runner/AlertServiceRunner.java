package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.AlertService;

@Component
public class AlertServiceRunner implements CommandLineRunner {

	@Autowired
	private AlertService as;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Runner");
		as.execute();
	}
}
