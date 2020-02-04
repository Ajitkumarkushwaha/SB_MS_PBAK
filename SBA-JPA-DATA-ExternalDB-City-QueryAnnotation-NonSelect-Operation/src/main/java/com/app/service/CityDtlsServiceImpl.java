package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.CityDtlsRepository;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */
@Service
public class CityDtlsServiceImpl implements CityDtlsService {

	/**
	 * 
	 * @see Inject CityDtlsRepsitory By Using Field Injection And Call The Methods
	 */
	@Autowired
	private CityDtlsRepository cityRepository;

	@Override
	public Integer modifyAllPopulationByCityCode(Long allPopulation, String cityCode) {
		return cityRepository.modifyAllPopulationByCityCode(allPopulation, cityCode);
	}

	@Override
	public Integer removeCityByCityCode(String cityCode) {
		return cityRepository.removeCityByCityCode(cityCode);
	}

}
