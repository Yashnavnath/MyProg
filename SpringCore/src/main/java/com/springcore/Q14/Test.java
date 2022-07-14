package com.springcore.Q14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/Q14/config.xml");
		System.out.println("________________Rectangle________________________");
		Rectangle obj= context.getBean("rect",Rectangle.class);
		System.out.println("Rectangle area : "+obj.area());
		System.out.println("Rectangle side : "+obj.side());
		
		System.out.println("\n____________________Circle____________________________");
		Circle obj1 = context.getBean("circle",Circle.class);
		System.out.println("Circle area : "+obj1.area());
		System.out.println("Circle side : "+obj1.side());
		
		
		System.out.println("\n___________________________Square_________________________");
		Square obj2 = context.getBean("square",Square.class);
		System.out.println("Square area : "+obj2.area());
		System.out.println("Square side : "+obj2.side());
		

	}

}
