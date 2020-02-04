package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmpDao;
import com.app.model.Employee;
import com.app.service.IEmpService;

@Service
public class EmpServiceImpl implements IEmpService {
	
	@Autowired
	private IEmpDao dao;

	@Override
	public int saveEmployees(Employee e) {
		int saveEmployees = dao.saveEmployees(e);
		
		return saveEmployees;
	}

}
