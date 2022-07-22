package com.yash.springORMHbrnt.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id
	int projectId;
	String projectname;
	int project_manager_id;
	
	@OneToMany(mappedBy="projecte")
	List<Employee> employee;
	
	
	public Project() {
		super();
		
	}

	public Project(int projectId, String projectname, int project_manager_id) {
		super();
		this.projectId = projectId;
		this.projectname = projectname;
		this.project_manager_id = project_manager_id;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public int getProject_manager_id() {
		return project_manager_id;
	}

	public void setProject_manager_id(int project_manager_id) {
		this.project_manager_id = project_manager_id;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	

}
