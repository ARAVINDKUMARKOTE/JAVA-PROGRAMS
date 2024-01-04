package com.usinginterfaceEx2;

public  class Developer implements frontEndTech , backEndTech
{	
	@Override
	public void learnJava()
	{
		System.out.println("Developer is learning Java");
	}
	public void learnHTML()
	{
		System.out.println("Developer is learning HTML");
	}
	
}
