package com.yash.springORMHbrnt;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springORMHbrnt.dao.EmpDao;
import com.yash.springORMHbrnt.model.BaseLocation;
import com.yash.springORMHbrnt.model.Department;
import com.yash.springORMHbrnt.model.Employee;
import com.yash.springORMHbrnt.model.IRM;
import com.yash.springORMHbrnt.model.Project;

public class App 
{
    public static void main( String[] args )
    {
   
    	double a;
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
          EmpDao dao= (EmpDao) context.getBean("EmpDao");
          
          Department dep= new Department();
          dep.setDepid(1003);
          dep.setDname("Hr");
          
          BaseLocation base =new BaseLocation();
          base.setBaseLocationId(202);
          base.setBaseLocation_name("Indore");
          
          IRM irm=new IRM();
          irm.setIRMId(3004);
          irm.setIrmname("Rahul Sharma");
          
          Project proj =new Project();
          proj.setProject_manager_id(103);
          proj.setProjectId(4002);
          proj.setProjectname("Delhi Metro");
          
          Employee emp =new Employee();
          emp.setEmpid(8);
          emp.setEmpname("Kunal");
          emp.setEaddress("Pune");
          emp.setDesignation("Trainee");
          emp.setDoj(LocalDate.of(2022, 10, 10));
          emp.setDol(LocalDate.of(2024, 10, 10));
          emp.setSalary(40000);
          emp.setBaselocation(base);
          emp.setDepartment(dep);
          emp.setIRM(irm);
          emp.setProjected(proj);
          
//          dao.saveDetails(emp, dep, base, proj, irm);
          
         List<Employee> empList =dao.getAllEmp();
          System.out.println("___________________________Projected Employee___________________________ ");
      	  for(Employee e:empList)
      	  {
      	     System.out.println(e.getEmpname()+" : "+e.getProjected().getProjectname());
      	    
      		  
      	  }
      	  
      	  System.out.println("________________________Employee with IRM Name_____________________________________");
      	 for(Employee e:empList)
     	  {
     	     System.out.println(e.getEmpname()+" : "+e.getIRM().getIrmname());
     	    
     		  
     	  }
      	  
          System.out.println("________________________________________________________________________");
     
         Project proj1= dao.getByProjectId(4002);
         System.out.println("___________________________________All Details of project_____________________________");
         for(Employee e : proj1.getEmployee())
         {
        	 System.out.println(e.getProjected().getProjectname()+" : "+e.getEmpname()+" : "+e.getBaselocation().getBaseLocation_name()+" : "+e.getIRM().getIrmname());
         }
         
        System.out.println("________________________ Maximum salary of each base location___________________________");
         dao.findMaxSalary();
             
         System.out.println("________________________ Minimum salary of each base location___________________________");
         dao.findMinSalary();  
         
         System.out.println("_________________________________Maximum salary of each project___________________________");
         dao.findMaxSalaryOFProjec();
         
         System.out.println("_________________________________Minimum salary of each project___________________________");
         dao.findMinSalaryOFProjec();
         
         
         System.out.println("________________________________________Average salary of each project_____________________");
         
         dao.avgSalary();
         
         
         
         System.out.println("________________________________________________________________________");
      List<IRM> obj= dao.getIRMDetails();
      for(IRM i:obj)
      {
    	  System.out.println("Name of IRM :"+i.getIrmname());
      }
      
      System.out.println("_________________________________________________________________________________");
      dao.getEmpByDept(1001);
       
     
    }
}
