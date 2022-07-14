package com.springcore.Q5;

public class MaxNum implements Number{

	public void method(int[] a) {
		int maxnum=a[0];
		for(int i:a)
		{
			if(i>maxnum)
				maxnum=i;
		}
		System.out.println("maximum number is :"+maxnum);
	}

}
