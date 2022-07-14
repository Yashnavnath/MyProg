package com.springcore.Q15;

public class Category {
	String cName;

	public Category() {
		super();
		
	}

	public Category(String cName) {
		super();
		this.cName = cName;
	}
	

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Category [cName=" + cName + "]";
	}
	
	

}
