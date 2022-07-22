package com.yash.springORMHbrnt.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class BaseLocation {
	@Id
	int baseLocationId;
	String baseLocation_name;
	
	@OneToMany(mappedBy="baselocation")
	List<Employee> employee;
	
	
	public BaseLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseLocation(int baseLocationId, String baseLocation_name) {
		super();
		this.baseLocationId = baseLocationId;
		this.baseLocation_name = baseLocation_name;
	}
	public int getBaseLocationId() {
		return baseLocationId;
	}
	public void setBaseLocationId(int baseLocationId) {
		this.baseLocationId = baseLocationId;
	}
	public String getBaseLocation_name() {
		return baseLocation_name;
	}
	public void setBaseLocation_name(String baseLocation_name) {
		this.baseLocation_name = baseLocation_name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
