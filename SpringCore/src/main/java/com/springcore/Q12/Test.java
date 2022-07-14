package com.springcore.Q12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/Q12/bean.xml");
		Employee obj= (Employee) context.getBean("bean1");
		Employee obj1= (Employee) context.getBean("bean2");
		Employee obj2= (Employee) context.getBean("bean3");
		Employee obj3= (Employee) context.getBean("bean4");
		Employee obj4= (Employee) context.getBean("bean5");
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		System.out.println("Highest salary by the department =");
		Map<Department,Optional<Employee>> max = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		max.entrySet().forEach(System.out::println);
	System.out.println("-----------------------------------------------------");
		
		System.out.println("Average salary of each department");
		Map<Department,Double> averagesalaryOfDept=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<Department,Double>> entrySet1=averagesalaryOfDept.entrySet();
		for(Entry<Department,Double> entry:entrySet1)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
