package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.app.bean.Employee;


@Component
@ConfigurationProperties("my")
public class BeanReadRunner implements CommandLineRunner {

	private Employee eob;
	@Override
	public void run(String... args) throws Exception {
	System.out.println(this);	
		
	}
	public Employee getEob() {
		return eob;
	}
	public void setEob(Employee eob) {
		this.eob = eob;
	}
	@Override
	public String toString() {
		return "BeanReadRunner [eob=" + eob + "]";
	}

}
