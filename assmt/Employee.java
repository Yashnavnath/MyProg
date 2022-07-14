package com.yash.assmt;

public class Employee {
	
	private String name;
	private String depmt;
	private double salary;
	public Employee(String name, String depmt, double salary) {
		super();
		this.name = name;
		this.depmt = depmt;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepmt() {
		return depmt;
	}
	public void setDepmt(String depmt) {
		this.depmt = depmt;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
