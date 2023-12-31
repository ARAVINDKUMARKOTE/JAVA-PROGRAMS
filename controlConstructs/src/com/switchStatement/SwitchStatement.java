package com.switchStatement;
import java.util.Scanner;
public class SwitchStatement {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Number between 1-5");
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Dispensing chips");
			break;
		case 2:
			System.out.println("Dispensing chacolates");
			break;
		case 3:
			System.out.println("Dispensing Water bottle");
			break;
		case 4:
			System.out.println("Dispensing Cool drinks");
			break;
		case 5:
			System.out.println("Dispensing Coffe");
			break;
		default:
			System.out.println("Dispensing chacolates");
			break;
		}
	}
	
}
