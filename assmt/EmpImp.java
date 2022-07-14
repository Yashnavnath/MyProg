package com.yash.assmt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpImp {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
        new Employee("Rajesh","IT",30000),
        new Employee("Ajay","HR",25000),
        new Employee("Divya","IT",35000),
        new Employee("Sarang","IT",30000)	);
		
		List<String> names=list.stream().map(m->m.getName()).collect(Collectors.toList());
		System.out.println(names);

	}

}
