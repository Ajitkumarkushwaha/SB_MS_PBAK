package com.app.service;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 */

public interface CityDtlsService {

	Integer modifyAllPopulationByCityCode(Long allPopulation, String cityCode);

	Integer removeCityByCityCode(String cityCode);
}
