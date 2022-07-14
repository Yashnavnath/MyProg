package com.springcore.Q8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
		Item obj = (Item) context.getBean("q8");
		System.out.println("Print all the list : "+obj.getName());
		List<Object> str=obj.getName().stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Remove the duplicate & Assending order : "+str);
		Collections.reverse(str);
		System.out.println("Dessending order:"+str);

	}

}
