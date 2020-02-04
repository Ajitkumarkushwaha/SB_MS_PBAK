package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.entity.FarmerDtlsEntity;
import com.app.repository.FarmerDtlsRepository;

@Component
public class FarmerDtlsRunner implements ApplicationRunner {

	@Autowired
	private FarmerDtlsRepository farmerRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

/*		FarmerDtlsEntity entity = new FarmerDtlsEntity(577337034126l,"AK13298","KUMAR AJIT","GOLAGHAT",8002077883l);
		FarmerDtlsEntity savedFarmer = farmerRepository.save(entity);
		System.out.println(savedFarmer);
		*/
		List<FarmerDtlsEntity> findByFarmerName = farmerRepository.findByFarmerName("AJIT KUMAR");
		System.out.println(findByFarmerName);
	}

}
