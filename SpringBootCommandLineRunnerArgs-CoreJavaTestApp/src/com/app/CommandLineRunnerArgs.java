package com.app;

public class CommandLineRunnerArgs {
 public static void main(String[] args) {
	System.out.println("Command Line Args");
	System.out.println( args[0] );
	System.out.println( args[1] );
	System.out.println("Virtual Machine Or System Arguments");
	String s = System.getProperty("title");
	System.out.println(s);
}
}
