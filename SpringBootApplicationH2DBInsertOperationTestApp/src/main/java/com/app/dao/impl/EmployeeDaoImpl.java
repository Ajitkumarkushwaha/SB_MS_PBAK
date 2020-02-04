package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	@Autowired
	private JdbcTemplate jt;
	private static final String INSER_QUERY = "INSERT INTO EMP1_TAB VALUES(?,?,?)";
	private static final String DELETE_QUERY = "DELETE FROM EMP1_TAB WHERE EID=?";
	private static final String UPDATE_QUERY = "UPDATE EMP1_TAB SET EMPNAME=?, EMPSAL=? WHERE EMPID=?";
	@Override
	public int saveEmployee(Employee emp) {
		int count = jt.update(INSER_QUERY, emp.getEmpId(),emp.getEmpName(),emp.getEmpSal());
		return count;
	}
	@Override
	public int deleteEmployee(Integer id) {
		int count = jt.update(DELETE_QUERY, id);
		return count;
	}
	@Override
	public int updateEmployee(Employee emp) {
		int count = jt.update(UPDATE_QUERY, emp.getEmpName(),emp.getEmpSal(),emp.getEmpId());
		return count;
	}

}
