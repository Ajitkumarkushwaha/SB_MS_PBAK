package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;
	@Override
	public int saveEmployee(Employee emp) throws Exception {
		return dao.saveEmployee(emp);
	}
	@Override
	public int deleteEmployee(Integer id) throws Exception {
		return dao.deleteEmployee(id);
	}
	@Override
	public int updateEmployee(Employee emp) throws Exception {
		return dao.updateEmployee(emp);
	}
}
