package com.Ex1;

public class Employee {
	    private int empId;
	    private String empName;
	    private int empSalary;
	    
  public Employee(int empId,String empName,int empSalary)
	{
		   this.empId=empId;
		   this.empName=empName;
		   this.empSalary=empSalary;
	}
	public int getempId()
	{
	    return empId;
	}
	public String getempName()
	{
	    return empName;
	}
	public int getempSalary()
	{
	    return empSalary;
	}
	
}

