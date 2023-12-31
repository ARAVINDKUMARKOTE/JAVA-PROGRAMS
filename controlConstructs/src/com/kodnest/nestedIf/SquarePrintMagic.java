package com.kodnest.nestedIf;
import java.util.Scanner;
public class SquarePrintMagic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle : ");
		int a = sc.nextInt();
		System.out.print("Enter breadth : ");
		int b = sc.nextInt();
		isMagic(a,b);
	}

	static void isMagic(int a, int b) {
		if(a==b) {
			int root = (int) Math.sqrt(a);
			if(root*root == a) {
				System.out.println("MAGIC");
			}
			else
			{
				System.out.println("Choose the corect sqrt");
			}
		}
		else
		{
			System.out.println("Check both length and breadth are same");
		}
	}

}

/*
Enter length of rectangle : 9
Enter breadth : 9
MAGIC

Enter length of rectangle : 2
Enter breadth : 2

 */
