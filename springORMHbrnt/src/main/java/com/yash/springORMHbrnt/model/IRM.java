package com.yash.springORMHbrnt.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class IRM {
	@Id
	int IRMId;
	String irmname;
	
	@OneToMany(mappedBy="IRM")
	List<Employee> employee;

	public IRM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IRM(int iRMId, String irmname, List<Employee> employee) {
		super();
		IRMId = iRMId;
		this.irmname = irmname;
		this.employee = employee;
	}

	public int getIRMId() {
		return IRMId;
	}

	public void setIRMId(int iRMId) {
		IRMId = iRMId;
	}

	public String getIrmname() {
		return irmname;
	}

	public void setIrmname(String irmname) {
		this.irmname = irmname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	

	
	
}
