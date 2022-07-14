package com.yash.assmt;
//   7  WAP to print only those price which are even from the given item list.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemPrice {
    int average=0;
	public static void main(String[] args) {
		List<Integer> price = Arrays.asList(20,13,7,21,24,30,40,35);
		List<Integer> even  = price.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		 

	    } 

 
	}
	


