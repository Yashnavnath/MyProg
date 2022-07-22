package com.yash.springORMHbrnt.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTransactionManager;


import com.yash.springORMHbrnt.model.BaseLocation;
import com.yash.springORMHbrnt.model.Department;
import com.yash.springORMHbrnt.model.Employee;
import com.yash.springORMHbrnt.model.IRM;
import com.yash.springORMHbrnt.model.Project;

public class EmpDao { 
	
	private HibernateTransactionManager hbmObj;

public void setHbmObj( HibernateTransactionManager hbmObj) {
	this.hbmObj = hbmObj;
}



public void saveDetails(Employee e,Department d,BaseLocation b,Project p,IRM i)
{
  SessionFactory sf =hbmObj.getSessionFactory();
  Session objSession = sf.openSession();
  Transaction t= objSession.beginTransaction();
	  objSession.save(e);
	  objSession.save(d);
	  objSession.save(b);
	  objSession.save(p);
	  objSession.save(i);
	  t.commit();
	  System.out.println("data is saved");
	  objSession.close();
}
public List<Employee> getAllEmp()
{
	  SessionFactory sf=hbmObj.getSessionFactory();
	  Session objSession =sf.openSession();
	  Transaction t= objSession.beginTransaction();
	  List<Employee> clist= new ArrayList<Employee>();
	  Criteria ctr =objSession.createCriteria(Employee.class);
	  clist= ctr.list();
	  return clist;
}
public Project getByProjectId(int projectId)
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  Project obj = (Project) objSession.get(Project.class,projectId);
	  System.out.println("project name : "+obj.getProjectname());
	  for(Employee e:obj.getEmployee())
	  {
		  System.out.println(e.getEmpname());
	  }
	  
	  return obj;
}

public void findMaxSalary()
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  String hql="SELECT base.baseLocation_name,base.baseLocationId,MAX(emp.salary) FROM BaseLocation base LEFT JOIN base.employee emp GROUP BY base";
	  Query query=objSession.createQuery(hql, Object[].class);
	  List<Object[]> list= ((org.hibernate.query.Query<Object[]>) query).list();
	  for(Object[] obj:list)
	  {
		  String baseLocation_name= (String) obj[0];
		  int baseLocationId=(Integer) obj[1];
		  double salary= (Double) obj[2];
		  System.out.println("BaseLocation Id : "+ baseLocationId);
		  System.out.println("BaseLocation Name : "+ baseLocation_name);
		  System.out.println("Max Salary : "+ salary);
	  }
	
}

public void findMinSalary()
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  String hql="SELECT base.baseLocation_name,base.baseLocationId,Min(emp.salary) FROM BaseLocation base LEFT JOIN base.employee emp GROUP BY base";
	  Query query=objSession.createQuery(hql, Object[].class);
	  List<Object[]> list= ((org.hibernate.query.Query<Object[]>) query).list();
	  for(Object[] obj:list)
	  {
		  String baseLocation_name= (String) obj[0];
		  int baseLocationId=(Integer) obj[1];
		  double salary= (Double) obj[2];
		  System.out.println("BaseLocation Id : "+ baseLocationId);
		  System.out.println("BaseLocation Name : "+ baseLocation_name);
		  System.out.println("Minimum Salary : "+ salary);
	  }
	
}

public void findMaxSalaryOFProjec()
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  String hql="SELECT proj.projectId,proj.projectname,MAX(emp.salary) FROM Project proj LEFT JOIN proj.employee emp GROUP BY proj";
	  Query query=objSession.createQuery(hql, Object[].class);
	  List<Object[]> list= ((org.hibernate.query.Query<Object[]>) query).list();
	  for(Object[] obj:list)
	  {
		  int projectId=(Integer) obj[0];
		  String projectname= (String) obj[1];
		  double salary= (Double) obj[2];
		  System.out.println("Project Id : "+ projectId);
		  System.out.println("Project Name : "+ projectname);
		  System.out.println("Max Salary : "+ salary);
	  }
	
}


public void avgSalary()
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  String hql="SELECT dept.dname,dept.departmentId,avg(emp.salary) FROM Department dept LEFT JOIN dept.employee emp GROUP BY dept";
	  Query query=objSession.createQuery(hql, Object[].class);
	  List<Object[]> list= ((org.hibernate.query.Query<Object[]>) query).list();
	  for(Object[] obj:list)
	  {
		  
		  String dname= (String) obj[0];
		  int departmentId=(Integer) obj[1];
		  double salary= (Double) obj[2];
		  System.out.println("Department Id : "+ departmentId);
		  System.out.println("Department Name : "+ dname);
		  System.out.println("Average Salary : "+ salary);
	  }
	
}

public List<IRM> getIRMDetails()
{
	SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  List<IRM> clist= new ArrayList<IRM>();
	  Criteria ctr =objSession.createCriteria(IRM.class);
	  clist= ctr.list();
	  return clist;
}

public void findMinSalaryOFProjec()
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  String hql="SELECT proj.projectId,proj.projectname,Min(emp.salary) FROM Project proj LEFT JOIN proj.employee emp GROUP BY proj";
	  Query query=objSession.createQuery(hql, Object[].class);
	  List<Object[]> list= ((org.hibernate.query.Query<Object[]>) query).list();
	  for(Object[] obj:list)
	  {
		  int projectId=(Integer) obj[0];
		  String projectname= (String) obj[1];
		  double salary= (Double) obj[2];
		  System.out.println("Project Id : "+ projectId);
		  System.out.println("Project Name : "+ projectname);
		  System.out.println("Minimum Salary : "+ salary);
	  }
	
}

public Department getEmpByDept(int deptId)
{
	  SessionFactory sf= hbmObj.getSessionFactory();
	  Session objSession = sf.openSession();
	  Transaction t=objSession.beginTransaction();
	  Department obj = (Department) objSession.get(Department.class,deptId);
	  System.out.println("Department name : "+obj.getDname());
	  for(Employee e:obj.getEmployee())
	  {
		  System.out.println(e.getEmpname());
	  }
	  
	  return obj;
}


}
