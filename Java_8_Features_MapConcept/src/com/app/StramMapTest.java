package com.app;

import java.util.stream.Stream;

public class StramMapTest {
	
	public static void main(String[] args) {
		String [] arr = {"hi","hello","ok","good night"};
		Stream.of(arr)
		//.map(String::toUpperCase)
		.map(String::length)
		.forEach(System.out::println);
	}

}
