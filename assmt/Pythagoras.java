package com.yash.assmt;

import java.util.Scanner;

public class Pythagoras {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=i+2;k<n;k++)
				{
					a=arr[i];
					b=arr[j];
					c=arr[k];
					if(a*a+b*b==c*c)
					{
						System.out.println(a+" "+b+" "+c+" ");
					}
				}
			}
		}

	}

}
