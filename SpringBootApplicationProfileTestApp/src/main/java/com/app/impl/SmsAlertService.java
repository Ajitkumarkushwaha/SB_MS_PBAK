package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.AlertService;

@Component
@Profile("default")
public class SmsAlertService implements AlertService {

	@Override
	public void execute() {
		System.out.println("Hello This Is SMS Alert Service and This Is Default Alert Service");

	}
}
