package com.app.ruunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.repository.AdminRepository;
import com.app.repository.AdminRepository.MyAdmin;
import com.app.repository.AdminRepository.MyAdminData;

@Component
public class AdminRunner implements ApplicationRunner {

	@Autowired
	private AdminRepository adminRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("-----My Admin Data---------------");
		adminRepository.findByAdminId(1112, MyAdminData.class).stream().map(m->m.getAdminName()+"=="
		+m.getAdminDept()+"="+m.getAdminMobNo()).forEach(System.out::println);
		System.out.println("------------My Admin--------------");
		adminRepository.findByAdminId(1011, MyAdmin.class).stream().map(m->m.getAdminName()+"=="+m.getAdminDept())
		.forEach(System.out::println);
	}

}
