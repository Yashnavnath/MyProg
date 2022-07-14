package com.springcore.Q10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	private HashMap<String ,Integer>std;

	public Student() {
		super();
		
	}
	
	public Map<String , Integer> getStd()
	{
		System.out.println(std);
		System.out.println("Sorted data by value");
		Map<String,Integer> map=std.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(map);
		return std;
	}

	
	
	public void setStd(HashMap<String, Integer> std) {
		this.std = std;
	}

	public Student(HashMap<String, Integer> std) {
		super();
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [std=" + std + "]";
	}
	
	

}
