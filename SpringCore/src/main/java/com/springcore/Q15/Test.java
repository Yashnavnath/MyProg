package com.springcore.Q15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/Q15/config.xml");
		Customer obj = (Customer) context.getBean("cbean");
		System.out.println(obj);

	}

}
