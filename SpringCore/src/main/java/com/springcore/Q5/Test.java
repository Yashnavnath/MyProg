package com.springcore.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
		Number obj = (Number) context.getBean("q5");
		obj.method(new int[] { 5,2,1,4,7,8,20,13,9});
		
	}

}
