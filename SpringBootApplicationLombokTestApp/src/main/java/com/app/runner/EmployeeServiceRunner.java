package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;

@Component
public class EmployeeServiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp = new Employee(10);
		emp.setEname("Emp");
		emp.setEsal(10.50);
		System.out.println(emp);
		Employee emp2 = new Employee();
		emp2.setEid(11);
		emp2.setEname("RAJA");
		emp2.setEsal(14.50);
		if(emp2.getEsal()<10) {
			System.out.println(emp2.getEsal());
		}
		else {
			System.out.println("Hello "+emp2.getEname()+" You Are The Most Paid Employee");
		}
		
		
	}

}
