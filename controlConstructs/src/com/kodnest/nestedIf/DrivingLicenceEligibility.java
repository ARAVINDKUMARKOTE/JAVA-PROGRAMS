package com.kodnest.nestedIf;
import java.util.Scanner;
public class DrivingLicenceEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Enter the detail of eyesight between 0-10 : ");
		int eyeSight = sc.nextInt() ;
		dLProcess(age,eyeSight);
	}

	static void dLProcess(int age, int eyeSight) {
		if(age>=18 ) 
		{
		    if(eyeSight>=6) 
		    {
				System.out.println("Driving License Eligible");
			}
		    else
		    {
		    	System.out.println("Driving Licence not Eligible" );
		    }
		}
		else
		{
		System.out.println("Driving Licence not Eligible");
		}
	}

}
/*
Enter Age : 22
Enter the detail of eyesight between 0-10 : 
7
Driving License Eligible

Enter Age : 22
Enter the detail of eyesight between 0-10 : 
5



*/