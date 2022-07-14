package com.yash.SpringCore;

public class Department {
	private String dname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String dname) {
		super();
		this.dname = dname;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}
	

}
