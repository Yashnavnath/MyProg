package com.yash.assmt;

import java.util.function.Predicate;

//     WAP to implement predicate to check given no is even or not


public class OddEven {

	public static void main(String[] args) {
	
		int odd=0;
		int even=0;
		int[] number= {10,7,13,12,15,20};
		
		Predicate<Integer> p =num -> (num%2==0);
		
		for(int i=0;i<number.length;i++)
		{
			if(p.test(number[i]))
			{
				even++;
			}else
			{
				odd++;
			}
		}
		
           System.out.println("Total even number is :"+even);
           System.out.println("Total odd number is :"+odd);
	}

}
