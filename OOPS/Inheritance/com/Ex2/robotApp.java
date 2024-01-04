package com.Ex2;

public class robotApp 
{
	public static void main(String[] args) {
		chefRobot cr=new chefRobot();
		cr.walk();
		cr.Talk();
		cr.charge();
		cr.cook();
		
		System.out.println();
		
		doctorRobot dr=new doctorRobot();
		dr.walk();
		dr.Talk();
		dr.charge();
		dr.surgery();
		
		System.out.println();
		
		teacherRobot tr=new teacherRobot();
		tr.walk();   
		tr.Talk();
		tr.charge();
		tr.teach();
		
		
	}
}
