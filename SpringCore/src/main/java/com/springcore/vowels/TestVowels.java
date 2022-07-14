package com.springcore.vowels;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVowels {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("autoconfig.xml");
	Vowels obj1=(Vowels) context.getBean("q6");
	obj1.method("Rajesh");

	}

}
