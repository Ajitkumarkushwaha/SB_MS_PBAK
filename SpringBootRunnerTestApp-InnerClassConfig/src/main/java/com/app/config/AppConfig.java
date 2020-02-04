package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 public CommandLineRunner clr() {
	 return new CommandLineRunner() {
		 @Override
		public void run(String... args) throws Exception {
		System.out.println("Hello World With Spring Boot Application Inner Class Configuration");
		}
	 };
 }
}
