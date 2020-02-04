package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.CityDtlsEntity;
import com.app.repository.CityDtlsRepository;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */
@Service
public class CityDtlsServiceImpl implements CityDtlsService{

	/**
	 * 
	 * @see Inject CityDtlsRepsitory By Using Field Injection And Call The Methods
	 */
	@Autowired
	private CityDtlsRepository cityRepository;
	@Override
	public List<CityDtlsEntity> getAllCityDtls() {
		return cityRepository.findAllCityDtls();
	}

	@Override
	public List<Long> getAllPopulationByCityCode(String cityCode) {
		return cityRepository.findAllPopulationByCityCode(cityCode);
	}

	@Override
	public List<Object[]> getAllMaleAndFemalePopulation(String cityCode) {
		
		return cityRepository.findAllMaleAndFemalePopulation(cityCode);
	}

}
