package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.AlertService;

@Component
@Profile("email")
public class EmailAlertService implements AlertService {

	@Override
	public void execute() {
		System.out.println("Hello This Is email Alert Service");

	}
}
