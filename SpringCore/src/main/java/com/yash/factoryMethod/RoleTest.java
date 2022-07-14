package com.yash.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
		Role r=(Role) context.getBean("role");
		r.display();

	}

}
