package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.service.IEmpService;

@Component
public class EmployeeSaveRunner implements CommandLineRunner {
	
	@Autowired
	private IEmpService service;

	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setEmpNo(1010);
		emp.setEmpName("HELLO RAJA");
		emp.setEmpSal(1111L);
		int saveEmployees = service.saveEmployees(emp);
		System.out.println(saveEmployees+" No Of Employee Is Saved");

	}

}
