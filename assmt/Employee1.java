package com.yash.assmt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee1 {
	
	private String name;
	private LocalDate dob;
	private LocalDate doj;
	private LocalDate dor;
    private String location;
    private String department;
    private double salary;
	public Employee1(String name, LocalDate dob, LocalDate doj, LocalDate dor, String location, String department,
			double salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.location = location;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor + ", location=" + location
				+ ", department=" + department + ", salary=" + salary + "]";
	}
    
	
	public static void main(String[] args) {
		
		List<Employee1> emplist = new ArrayList<>();
		emplist.add(new Employee1("Rajesh", LocalDate.of(1999, 12, 3), LocalDate.of(2018, 10, 11), LocalDate.of(2020, 10, 8),"Pune", "Account", 25000));
		emplist.add(new Employee1("Akash", LocalDate.of(1998, 12, 3), LocalDate.of(2018, 10, 11), LocalDate.of(2022, 05, 3),"Mumbai", "HR", 30000));
		emplist.add(new Employee1("Mukund", LocalDate.of(1995, 12, 3), LocalDate.of(2017, 10, 11), LocalDate.of(2020, 10, 8),"Pune", "IT", 50000));
		emplist.add(new Employee1("Radhika", LocalDate.of(1999, 5, 3), LocalDate.of(2018, 10, 11), LocalDate.of(2020, 10, 8),"Mumbai", "HR", 25000));
		emplist.add(new Employee1("Anmol", LocalDate.of(1999, 10, 3), LocalDate.of(2018, 10, 11), LocalDate.of(2020, 10, 8),"Hydrabad", "IT", 40000));
		emplist.add(new Employee1("Arjun", LocalDate.of(1998, 9, 3), LocalDate.of(2018, 10, 11), LocalDate.of(2021, 9, 5),"Pune", "Managment", 25000));
		emplist.add(new Employee1("Rawan", LocalDate.of(1995, 7, 10), LocalDate.of(2020, 10, 11), LocalDate.of(2022, 11, 8),"Pune", "IT", 50000));
		
		
		System.out.println("Employee in particular department:");
		Map<String, List<Employee1>> emplistOfDept = emplist.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
		Set<Entry<String,List<Employee1>>> entrySet = emplistOfDept.entrySet();
		
		for(Entry<String,List<Employee1>> entry:entrySet)
		{
			System.out.println("------------------------");
			System.out.println("Employee In :"+entry.getKey()+":");
			System.out.println("----------------------");
			List<Employee1> list=entry.getValue();
			for(Employee1 e :list)
			{
				System.out.println(e.getName());
			}
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Highest Salary =");
		Map<String,Optional<Employee1>> max = emplist.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))));
		max.entrySet().forEach(System.out::println);
		
		System.out.println("Lowest Salary");
		Map<String,Optional<Employee1>> min=emplist.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.minBy(Comparator.comparingDouble(Employee1::getSalary))));
		min.entrySet().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Average salary of each department");
		Map<String,Double> averagesalaryOfDept=emplist.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.averagingDouble(Employee1::getSalary)));
		Set<Entry<String,Double>> entrySet1=averagesalaryOfDept.entrySet();
		for(Entry<String,Double> entry:entrySet1)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Number of employee in each department");
		
		Map<String,Long> noOfEmp=
				emplist.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
		System.out.println(noOfEmp);
	}
}
