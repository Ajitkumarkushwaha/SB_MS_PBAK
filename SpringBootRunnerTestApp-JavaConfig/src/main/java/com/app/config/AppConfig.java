package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.runner.MyRunner;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cr() {
		return new MyRunner();
	}
}
