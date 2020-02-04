package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.CustomerDtlsEntity;

/**
 * 
 * @author AJIT KUMAR
 *
 */

public interface CustomerDtlsRepository extends JpaRepository<CustomerDtlsEntity, Integer> {

	@Query("SELECT C FROM  CustomerDtlsEntity C")
	List<CustomerDtlsEntity> findAllCustomer();

	@Query("SELECT C.customerName FROM CustomerDtlsEntity C")
	List<String> findAllCustomerName();

	@Query("SELECT C.customerMobNo FROM CustomerDtlsEntity C")
	List<Long> findAllCustomerMobNo();

	@Query("SELECT C.customerName, C.customerId FROM CustomerDtlsEntity C")
	List<Object[]> findAllCustomerNameAndId();

	@Query("SELECT C.customerName, C.customerMobNo FROM CustomerDtlsEntity C")
	List<Object[]> findAllCustomerNameMobNo();

}