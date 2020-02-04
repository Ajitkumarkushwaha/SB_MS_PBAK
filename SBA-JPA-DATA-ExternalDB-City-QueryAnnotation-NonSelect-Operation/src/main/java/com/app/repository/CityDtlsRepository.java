package com.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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
	 * @param cityCode
	 * @target Modify The Population of city Based On City Code
	 * @return All Population Of City
	 */
	@Modifying
	@Transactional
	@Query("UPDATE CityDtlsEntity C SET C.allPopulation=:allPopulation WHERE C.cityCode=:cityCode")
	Integer modifyAllPopulationByCityCode(Long allPopulation, String cityCode);

	/**
	 * 
	 * @target Remove The City Details Based On City Code
	 * @param cityCode
	 * @return boolean Result
	 */
	@Modifying
	@Transactional
	@Query("DELETE FROM CityDtlsEntity C WHERE C.cityCode=:cityCode")
	Integer removeCityByCityCode(String cityCode);

	/**
	 * 
	 * @uses Implement This Repository Interface To Your Classes And Use it
	 */
}
