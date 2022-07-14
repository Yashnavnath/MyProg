package com.springcore.Q1;

public class Role1 {
private Role1()
{
	
}
public static Role1 getobj()
{
	return new Role1();
}
public void show()
{
	System.out.println("Role based object is created..");
}
}
