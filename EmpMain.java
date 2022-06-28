package com.yash.assmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpMain {
	
	public static void main(String[] args) {
		
		List<Emp> list= new ArrayList<>();
		list.add(new Emp(101, "Neeraj"));
		list.add(new Emp(102, "Raj"));
		list.add(new Emp(103, "Avesh"));
		list.add(new Emp(104, "Divya"));
		list.add(new Emp(105, "Shraddha"));
		list.add(new Emp(106, "Nilesh"));
		list.add(new Emp(107, "Neelu"));
		list.add(new Emp(108, "Ankit"));
		list.add(new Emp(109, "Rakul"));
		list.add(new Emp(110, "Ajay"));
		
		
		Map<Integer,String> map= list.stream().collect(Collectors.toMap(e1->e1.getId(),e2->e2.getName() ));
		System.out.println(map);
		System.out.println("---------------------------------------------------");
		
		Set<Emp> set=list.stream().collect(Collectors.toSet());
		for(Emp value:set)
		{
			System.out.println("Emp id="+value.id+ "  Emp name ="+value.name);
		}
	}

}
