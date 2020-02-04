package com.app.model;

public class Employee {
	
	private Integer eid;
	private String ename;
	private Long esal;

	public Employee(int i, String string, double d) {
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Long getEsal() {
		return esal;
	}

	public void setEsal(Long esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
}
