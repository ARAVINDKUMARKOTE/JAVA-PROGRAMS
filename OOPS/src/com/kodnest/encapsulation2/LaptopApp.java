package com.kodnest.encapsulation2;

public class LaptopApp {
	public static void main(String[] args) {
		Laptop l1=new Laptop("I5",4);
		System.out.println(l1.getProcessorName());
		System.out.println(l1.getMemorySize());
		
		
		
		Laptop l2=new Laptop("I6",8);
		System.out.println(l2.getProcessorName());
		System.out.println(l2.getMemorySize());
	}

}
