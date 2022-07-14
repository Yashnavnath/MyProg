package com.yash.assmt;

import java.util.Arrays;
import java.util.List;

public class FindMax {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,30,12,10,60,2,4);
		Integer max=list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("maximum number is :"+max);
		       
	}

}
