package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.repository.AdminRepository;

@Component
public class AdminRunner implements ApplicationRunner {

	@Autowired
	private AdminRepository adminRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {

		adminRepository.findByAdminId(1112).stream().map(m->m.getAdminName()+"=="+m.getAdminDept())
		.forEach(System.out::println);
	}

}
