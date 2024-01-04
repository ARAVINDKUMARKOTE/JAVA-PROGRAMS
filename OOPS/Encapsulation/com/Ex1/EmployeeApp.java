package com.Ex1;

public class EmployeeApp 
{
	 public static void main(String[] args) 
	    {
	        Employee e1=new Employee(1,"Aravind",45000);
	        System.out.println(e1.getempId()); 
	        System.out.println(e1.getempName());
	        System.out.println(e1.getempSalary());
	     
	        System.out.println();
	        
	        Employee e2=new Employee(2,"Satheesh",75000);
	        System.out.println(e2.getempId()); 
	        System.out.println(e2.getempName());
	        System.out.println(e2.getempSalary());
	        
	    }
}
