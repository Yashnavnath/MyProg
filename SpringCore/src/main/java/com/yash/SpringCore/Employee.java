package com.yash.SpringCore;

public class Employee {
	
	private Department department;
	private int id;
	private String name;
	private double salary;
	
	
	public Employee() {
		super();
		
	}


	public Employee(Department department, int id, String name, double salary) {
		super();
		this.department = department;
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	

}
