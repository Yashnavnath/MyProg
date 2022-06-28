package com.yash.assmt;
//   WAP to print distinct marks from the list of given marks 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Marks {

	public static void main(String[] args) {
		 
      List<Integer> list= Arrays.asList(80,60,75,86,88,80);
      List<Integer> marks = list.stream().distinct().sorted().collect(Collectors.toList());
      System.out.println(marks);
 
	}

}
