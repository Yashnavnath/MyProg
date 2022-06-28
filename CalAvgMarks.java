//  WAP to find out average marks from the list of the marks, user will enter the marks through 
//the input box and you need to fetch them and calculate the marks.



package com.yash.assmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalAvgMarks {
 
	public static void main(String[] args) {
		int marks=0;
		int average=0;
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter No Of subject");
        size=sc.nextInt();
        System.out.println("Enter Subject marks");
        ArrayList<Integer> num = new  ArrayList<Integer>();
        
        for(int i=1;i<=size;i++)
        {
        	num.add(sc.nextInt());
        }
        
        for(int value:num)
        {
        	marks=marks+value;
        	average=marks/size;
        	
        }
        System.out.println("Total marks is :"+marks);
        System.out.println("The Avrage of marks is :"+average);
        
        
        
        
        
	
	    
	}

}
