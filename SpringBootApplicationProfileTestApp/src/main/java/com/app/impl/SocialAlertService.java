package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.AlertService;

@Component
@Profile("social")
public class SocialAlertService implements AlertService {

	@Override
	public void execute() {
		System.out.println("Hello This Is Social Alert Service");

	}
}
