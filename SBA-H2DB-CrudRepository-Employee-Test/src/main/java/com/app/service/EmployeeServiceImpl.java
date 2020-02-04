package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.EmployeeEntity;
import com.app.repository.EmployeeRepository;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public boolean saveEmployee(EmployeeEntity entity) {
		EmployeeEntity savedEmployee = repository.save(entity);
		return savedEmployee != null;
	}

}
