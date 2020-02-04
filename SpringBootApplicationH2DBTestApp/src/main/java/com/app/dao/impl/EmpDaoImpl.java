package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmpDao;
import com.app.model.Employee;


@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	private JdbcTemplate jt;

	private static final String INSERT_QUERY = "INSERT INTO EMPTAB VALUES(?, ?, ?)";
	@Override
	public int saveEmployees(Employee e) {
		
		int count = jt.update(INSERT_QUERY, e.getEmpNo(),e.getEmpName(),e.getEmpSal());
		
		return count;
	}

}
