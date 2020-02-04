package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Component
public class JdbcH2DBTestRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		
		//save opeartion
		/**Employee e = new Employee();
		e.setEmpId(1398);
		e.setEmpName("ATUL");
		e.setEmpSal(12.3);
		service.saveEmployee(e);
		System.out.println("Employee Details Are Saved");*/
		//update
		/**Employee e = new Employee();
		e.setEmpId(1398);
		e.setEmpName("RAJ KUMAR");
		e.setEmpSal(122.33);
		service.saveEmployee(e);
		System.out.println("Employee Details Are Updated");
		*/
		//delete Test
		service.deleteEmployee(101);
		System.out.println("Employee Details Are Deleted");
		
	}

}