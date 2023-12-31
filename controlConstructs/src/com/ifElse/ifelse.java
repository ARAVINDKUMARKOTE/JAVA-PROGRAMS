package com.ifElse;
import java.util.Scanner;
public class ifelse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp=scan.nextInt();
		if(temp>=40)
		{
			System.out.println("Weather is too hot! stay inside");
		}
		else
		{
			System.out.println("Weather is pleasent");
		}
		
	}

}
