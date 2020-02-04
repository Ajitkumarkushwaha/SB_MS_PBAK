package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.FarmerDtlsEntity;

public interface FarmerDtlsRepository extends JpaRepository<FarmerDtlsEntity, Integer> {
	
	public List<FarmerDtlsEntity> findByFarmerName(String farmerName);

}
