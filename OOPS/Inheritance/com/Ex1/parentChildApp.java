package com.Ex1;

public class parentChildApp 
{
	public static void main(String[] args) {
		parent p=new parent();
		p.foodBusiness();
		System.out.println(p.eyecolour);
		System.out.println();
		child c=new child();
		c.foodBusiness();
		System.out.println(c.eyecolour);
		
		
	}
}
