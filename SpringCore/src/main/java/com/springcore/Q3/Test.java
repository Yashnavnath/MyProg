package com.springcore.Q3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Q2.Average;

public class Test {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
	Emi obj = (Emi) context.getBean("q3");
	System.out.println("Interest Rate: "+obj.rate+"%");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount");
	float amount=sc.nextFloat();
	
	System.out.println("Enter validity in year");
	int validity = sc.nextInt();
	int validityinMonth=validity*12;
	
	double TPA=amount+((amount*obj.rate)/100)*validity;
	System.out.println("Total payble amount:"+TPA);
	
	double emi=TPA/validityinMonth;
	System.out.println("Emi for total amount:"+emi);
}
}
