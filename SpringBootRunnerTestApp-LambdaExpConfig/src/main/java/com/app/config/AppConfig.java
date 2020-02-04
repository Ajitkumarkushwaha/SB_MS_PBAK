package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner clr() {
		return s-> System.out.println("Hello Welcome In Boot Programming With Lambda Expression");
		/*return (s)->{
	System.out.println("Hello");	
	};*/
	}
}
