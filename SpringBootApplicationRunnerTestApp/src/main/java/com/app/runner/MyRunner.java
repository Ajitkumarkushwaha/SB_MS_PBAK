package com.app.runner;




import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Welcome !!");
		//Print Non Option Args
		System.out.println(args.getNonOptionArgs());
		//Option Args Key Only
		System.out.println(args.getOptionNames());
		//Option Args Specific Value
		System.out.println(args.getOptionValues("title"));
		//Check Key Exist or Not
		System.out.println(args.containsOption("title"));
		//One Key All Values
		System.out.println("prod");
		//all inputs args as array
		System.out.println(Arrays.asList(args.getSourceArgs()));
	}

}
