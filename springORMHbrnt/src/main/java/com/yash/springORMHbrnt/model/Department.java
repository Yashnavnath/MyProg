package com.yash.springORMHbrnt.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	
	@Id
	int departmentId;
	String dname;
	
	@OneToMany(mappedBy="department")
	List<Employee> employee;
	
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department() {
		super();
		
	}
	
	public Department(int depid, String dname) {
		super();
		this.departmentId = depid;
		this.dname = dname;
	}

	public int getDepid() {
		return departmentId;
	}
	public void setDepid(int depid) {
		this.departmentId = depid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	

}
