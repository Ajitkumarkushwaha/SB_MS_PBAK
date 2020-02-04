package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.EmployeeEntity;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
