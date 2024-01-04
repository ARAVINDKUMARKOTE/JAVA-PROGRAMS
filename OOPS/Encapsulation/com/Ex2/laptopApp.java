package com.Ex2;

public class laptopApp 
{
	public static void main(String[] args)
	{
		laptop l1=new laptop(4,"I5");
		System.out.println(l1.getmemorySize());
		System.out.println(l1.getprocessorName());
		
		System.out.println();

		laptop l2=new laptop(8,"I6");
		System.out.println(l2.getmemorySize());
		System.out.println(l2.getprocessorName());
		
		
	}
}
