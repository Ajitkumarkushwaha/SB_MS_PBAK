package com.app.dao;

import com.app.model.Employee;

public interface IEmployeeDao {
	public int saveEmployee(Employee emp);
	public int deleteEmployee(Integer id);
	public int updateEmployee(Employee emp);

}
