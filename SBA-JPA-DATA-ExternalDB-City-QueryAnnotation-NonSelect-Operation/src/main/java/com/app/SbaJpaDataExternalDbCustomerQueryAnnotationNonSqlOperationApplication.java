package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.service.CityDtlsServiceImpl;

/**
 * 
 * @author AJIT KUMAR
 * @since 1.0.0
 *
 */

@SpringBootApplication
public class SbaJpaDataExternalDbCustomerQueryAnnotationNonSqlOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication
				.run(SbaJpaDataExternalDbCustomerQueryAnnotationNonSqlOperationApplication.class, args);
		CityDtlsServiceImpl cityService = ctxt.getBean(CityDtlsServiceImpl.class);
		/**
		 * Call The All Methods By Using cityService
		 */

		/**
		 * @see Call modifyAllPopulationByCityCode() method and Modify The City Details
		 * @see Affected City Details
		 */
		Integer noOfCity = cityService.modifyAllPopulationByCityCode(4500000l, "BRNKE");
		System.out.println(noOfCity);
		/**
		 * @see Call removeCityByCityCode() And remove The City Details Based On City Code
		 * @return status
		 */
		Integer removedStatus = cityService.removeCityByCityCode("BRMZP");
		System.out.println(removedStatus);
	}

}