package com.kodnest.encapsulation2;
//import java.util.Scanner;
 class Employee
 {
		private int empId;
		private String empName;
		private int empsalary;
		// this employee is a constructor
	public Employee(int empId,String empName,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empsalary=empsalary;
	}
	public int getempId()
	{
		return empId;
	}
	public String getempName()
	{
		return empName;
	}
	public float getempsalary()
	{
		return empsalary;
	}

}
