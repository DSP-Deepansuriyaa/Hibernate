package com.niit.Hibernate.model;

public class Employee {
	int empid;
	String empname;
	String empdest;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdest() {
		return empdest;
	}
	public void setEmpdest(String empdest) {
		this.empdest = empdest;
	}
}