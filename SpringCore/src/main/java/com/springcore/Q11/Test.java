package com.springcore.Q11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	 List<Student> list= new ArrayList<>();
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/Q11/config.xml");
	Student obj = (Student) context.getBean("student1");
	Student obj1 = (Student) context.getBean("student2");
	Student obj2 = (Student) context.getBean("student3");
	Student obj3 = (Student) context.getBean("student4");
	Student obj4 = (Student) context.getBean("student5");
	list.add(obj);
	list.add(obj1);
	list.add(obj2);
	list.add(obj3);
	list.add(obj4);
	
	for(Student s:list)
	{
		System.out.println(s.sname +" : "+s.result.totalmarks);
	}
	System.out.println("_______________________________________________________");
       List<Student> slist=	list.stream().sorted((s1,s2)->Integer.compare(s1.result.totalmarks, s2.result.totalmarks)).collect(Collectors.toList());
        System.out.println("Sorted list of student as per the total marks");
    
    for(Student stud:slist)
    {
    	System.out.println(stud.sname+" : "+stud.result.totalmarks);
    }
}
}
