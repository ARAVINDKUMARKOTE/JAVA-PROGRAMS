package com.usinginterfaceEx1;

public class studentApp {
	public static void doActivity(studentActivities sa)
	{
		sa.attendClass();
		sa.study();
		sa.assignment();
	}
	
	public static void main(String[] args) {
		physicsStudent ps=new physicsStudent();
		chemistryStudent cs=new chemistryStudent();
		
		
		doActivity(ps);
		System.out.println();
		doActivity(cs);
		
	}

}
