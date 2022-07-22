package com.yash.springORMHbrnt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	int empid;
	String empname;
	String eaddress;
	LocalDate doj;
	LocalDate dol;
	double salary;
	@OneToOne(cascade = CascadeType.ALL)
	Department department;
	String designation;
    @OneToOne(cascade = CascadeType.ALL)
	IRM IRM;
	@ManyToOne(cascade = CascadeType.ALL)
	Project projecte;
    @ManyToOne(cascade = CascadeType.ALL )
	BaseLocation baselocation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, String eaddress, LocalDate doj, LocalDate dol, double salary,
			Department department, String designation, com.yash.springORMHbrnt.model.IRM iRM, Project projected,
			BaseLocation baselocation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.eaddress = eaddress;
		this.doj = doj;
		this.dol = dol;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.IRM = iRM;
		this.projecte = projected;
		this.baselocation = baselocation;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public LocalDate getDol() {
		return dol;
	}

	public void setDol(LocalDate dol) {
		this.dol = dol;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public IRM getIRM() {
		return IRM;
	}

	public void setIRM(IRM iRM) {
		IRM = iRM;
	}

	public Project getProjected() {
		return projecte;
	}

	public void setProjected(Project projected) {
		this.projecte = projected;
	}

	public BaseLocation getBaselocation() {
		return baselocation;
	}

	public void setBaselocation(BaseLocation baselocation) {
		this.baselocation = baselocation;
	}
	
	
	
	

}
