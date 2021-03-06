package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.entity.CustomerDtlsEntity;
import com.app.repository.CustomerDtlsRepository;

/**
 * 
 * @author AJIT KUMAR
 *
 */

@Component
public class CustomerDtlsRunner implements ApplicationRunner {

	@Autowired
	private CustomerDtlsRepository customerRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		CustomerDtlsEntity entity = new CustomerDtlsEntity(11013, "RAJESH", 77989765l, "GKP");
		CustomerDtlsEntity savedEntity = customerRepository.save(entity);
		System.out.println(savedEntity);
		customerRepository.findAllCustomer().forEach(System.out::println);

		customerRepository.findAllCustomerName().forEach(System.out::println);

		customerRepository.findAllCustomerNameAndId().stream().map(arr -> arr[0] + "===" + arr[1])
				.forEach(System.out::println);
		customerRepository.findAllCustomerMobNo().forEach(System.out::println);

	}

}
