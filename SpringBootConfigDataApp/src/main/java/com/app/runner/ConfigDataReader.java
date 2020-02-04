package com.app.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.data")
public class ConfigDataReader implements CommandLineRunner {

	private int empId;
	private String empName;
	private double empSal;
	private List<String> proj;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	public ConfigDataReader() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public List<String> getProj() {
		return proj;
	}
	public void setProj(List<String> proj) {
		this.proj = proj;
	}
	@Override
	public String toString() {
		return "ConfigDataReader [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", proj=" + proj
				+ "]";
	}
}
