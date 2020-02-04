package com.app;

import java.util.stream.Stream;

public class FilterTestApp {

	public static void main(String[] args) {
		String[] arr = {"Hello","Friend","Hii","Sanjeet"};
		//Stream.of(arr).filter(s->s.contains("H")).forEach(System.out::println);
		Stream.of(arr).filter(s->s.contains("H")).filter(s->s.length()<=3).forEach(System.out::println);
		/*List<Employee> emps = Arrays.asList(
				new Employee(10,"A",30.3),
				new Employee(11,"B",31.3),
				new Employee(12,"C",32.3)
				);
		emps.stream().filter(e->e.getEsal()>=31).map(Employee::getEname).forEach(System.out::println);*/
	}
}
