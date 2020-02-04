package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */
 
@Data
@Entity
@Table(name = "EMPLOYEE_MASTER")
public class EmployeeEntity {
	@Id
	private Integer empId;
	private String empName;
	private Long empMobNo;
	private Double empSal;

}
