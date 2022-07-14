package com.springcore.Q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/Q10/config.xml");
		Student obj=context.getBean("q10",Student.class);
		obj.getStd();

	}

}
