package com.springcore.Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
		Employee obj=(Employee) context.getBean("q4");
		Employee obj1=(Employee) context.getBean("q41");
		list.add(obj);
		list.add(obj1);
		List<Employee> emp=list.stream().sorted((e1,e2) ->Double.compare(e1.salary, e2.salary)).collect(Collectors.toList());
		
		for(Employee emp1:emp)
		{
			System.out.println(emp1);
		}

	}

}
