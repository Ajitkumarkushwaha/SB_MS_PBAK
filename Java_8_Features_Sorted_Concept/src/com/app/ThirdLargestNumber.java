package com.app;

import java.util.stream.Stream;

public class ThirdLargestNumber {
	
	public static void main(String[] args) {
		int[] arr = {20,35,25,55,85,65,75};
		//Stream.of(20,35,25,55,85,65,75).sorted((O1,O2)->O1-O2).forEach(System.out::println);
		/*Integer min = Stream.of(20,35,25,55,85,65,75).min((O1,O2)->O1-O2).get();
		System.out.println(min);*/
		//Stream.of(20,35,25,55,85,65,75).sorted((O1,O2)->O2-O1).skip(2).limit(1).forEach(System.out::println);
/*	List<Integer> list = new ArrayList<Integer>();
	list.add(12);
	list.add(25);
	list.add(22);
	list.add(45);
	list.add(35);
	list.add(30);

	
	System.out.println("Minimum Element In The List:- "+list.stream().min((O1,O2)->O1-O2).get());
	System.out.println("Miximum Element In The List:- "+list.stream().max((O1,O2)->O1-O2).get());
	*/
	Stream.of(arr).forEach(System.out::println);
	}
}
