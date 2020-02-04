package com.app.service;

import com.app.model.Employee;

public interface IEmployeeService {

	public int saveEmployee(Employee emp) throws Exception;
	public int deleteEmployee(Integer id)throws Exception;
	public int updateEmployee(Employee emp)throws Exception;
}
