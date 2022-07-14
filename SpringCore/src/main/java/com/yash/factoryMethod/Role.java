package com.yash.factoryMethod;

public class Role {
	
	private Role()
	{
	}
	
	public static Role userRole()
	{
		
		return new Role();
	}
	
	public void display()
	{
		System.out.println("This is the admin role");
	}
	
	

}
