package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.service.CityDtlsServiceImpl;

/**
 * 
 * @author AJIT KUMAR
 * 
 * @since 1.0.0
 *
 */

@SpringBootApplication
public class SbaJpaDataExternalDbCustomerQueryAnnotationNamedParmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SbaJpaDataExternalDbCustomerQueryAnnotationNamedParmApplication.class, args);
		CityDtlsServiceImpl cityService = ctxt.getBean(CityDtlsServiceImpl.class);
		/**
		 * Call The All Methods By Using cityService
		 */

		/**
		 * @see Call getAllCityDtls() method and Get All City Details
		 */
		cityService.getAllCityDtls().forEach(System.out::println);
		/**
		 * @see Call getAllPopulation() method and Get Total Population Of City
		 */
		cityService.getAllPopulationByCityCode("BRBTH").forEach(System.out::println);
		/**
		 * @see Call getAllMaleAndFemalePopulation() method and To Get Male And Female
		 *      Population
		 */
		cityService.getAllMaleAndFemalePopulation("BRBTH").stream().map(
				city -> "All Male Populations of City :-" + city[0] + " All Female Population Of City :-" + city[1])
				.forEach(System.out::println);
	}

}
