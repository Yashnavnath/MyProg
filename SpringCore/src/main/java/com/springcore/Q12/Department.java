package com.springcore.Q12;

public class Department {
	String depName;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String depName) {
		super();
		this.depName = depName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Department [depName=" + depName + "]";
	}
	

}
