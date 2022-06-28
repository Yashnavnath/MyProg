package com.yash.assmt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class EmpName {
	public static void main(String[] args) {
		List<String> empname= Arrays.asList("Raj","Ajay","Ram","Divya","Raj","Ajay");
//		HashSet<String> hash = new HashSet(empname);
//		 List<String> names= hash.stream().sorted().collect(Collectors.toList());
		 List<String> names=empname.stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println(names);
		  
		  
		
	}

}
