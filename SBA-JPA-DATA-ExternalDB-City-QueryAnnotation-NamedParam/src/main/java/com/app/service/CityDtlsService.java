package com.app.service;

import java.util.List;

import com.app.entity.CityDtlsEntity;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 */

public interface CityDtlsService {

	List<CityDtlsEntity> getAllCityDtls();
	List<Long> getAllPopulationByCityCode(String cityCode);
	List<Object[]> getAllMaleAndFemalePopulation(String cityCode);

}
