package com.yash.assmt;

import java.util.Arrays;
import java.util.List;

public class MaxLength {
	public static void main(String[] args) {
		List<String> empname= Arrays.asList("Raj","Ajay","Ram","Divya","Rameshwar","Akash");
		String name=empname.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(name);
	}

}
