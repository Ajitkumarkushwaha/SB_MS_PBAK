package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	interface MyAdmin{
		String getAdminName();
		String getAdminDept();
	}
	interface MyAdminData{
		String getAdminName();
		String getAdminDept();
		Long getAdminMobNo();
	}
	<T> List<T> findByAdminId(Integer adminId, Class<T> cls);
}
