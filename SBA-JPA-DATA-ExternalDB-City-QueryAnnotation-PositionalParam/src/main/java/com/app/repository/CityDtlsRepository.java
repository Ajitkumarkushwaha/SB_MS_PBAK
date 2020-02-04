package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.CityDtlsEntity;

/**
 *
 * @author AJIT KUMAR
 * @since 1.0.0
 */

public interface CityDtlsRepository extends JpaRepository<CityDtlsEntity, String> {

	/**
	 * 
	 * @target Get The All City Details
	 * 
	 */
	@Query("SELECT C FROM CityDtlsEntity C")
	List<CityDtlsEntity> findAllCityDtls();

	/**
	 * 
	 * @param cityCode
	 * @target Get All The City Population Based On City Code
	 * @return All Population Of City
	 */
	@Query("SELECT C.allPopulation FROM CityDtlsEntity C WHERE C.cityCode=?1")
	List<Long> findAllPopulationByCityCode(String cityCode);

	/**
	 * 
	 * @target Get All Male And Female Population Based On City Code
	 * @param cityCode
	 * @return Male Population And Female Population
	 */
	@Query("SELECT C.malePopulation, C.femalePopulation FROM CityDtlsEntity C WHERE C.cityCode=?1")
	List<Object[]> findAllMaleAndFemalePopulation(String cityCode);

	/**
	 * 
	 * @uses Implement This Repository Interface To Your Classes And Use it
	 */
}
