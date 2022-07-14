package com.springcore.vowels;

public class CheckVowels implements Vowels{

	public void method(String str) {
		str=str.replaceAll("aeiouAEIOU", "");
		System.out.println("\nString without vowels="+str);
		
	}

}
