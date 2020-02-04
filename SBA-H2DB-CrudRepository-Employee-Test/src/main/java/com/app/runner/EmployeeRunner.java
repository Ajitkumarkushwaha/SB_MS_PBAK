package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.EmployeeEntity;
import com.app.service.EmployeeService;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {

		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpId(221012);
		employeeEntity.setEmpMobNo(91919191l);
		employeeEntity.setEmpName("NATARAZ SIR");
		employeeEntity.setEmpSal(500.10);
		boolean savedEmployee = employeeService.saveEmployee(employeeEntity);
		System.out.println("Employee Details Are Saved :-" + savedEmployee);
		
	
	}

}
