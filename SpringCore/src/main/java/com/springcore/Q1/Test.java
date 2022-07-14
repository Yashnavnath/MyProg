package com.springcore.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
		Role1 obj=(Role1) context.getBean("q1");
		obj.show();
		
	}
	
	
}
