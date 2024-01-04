package com.abstractClassEx2;

public class developerApp {
	public static void doActivity(Developer ref)
	{
		ref.attendMeeting();
		ref.doProject();
		if(ref instanceof javaDeveloper)
		{
			((javaDeveloper)(ref)).learnJava();
		}
		else if(ref instanceof javaDeveloper)
		{
			((pythonDeveloper)(ref)).learnPython();
		}
	}
	public static void main(String[] args) {
		javaDeveloper jd=new javaDeveloper();
		pythonDeveloper pd = new pythonDeveloper();
		doActivity(jd);
		System.out.println("==========================");
		doActivity(pd);
	}
}
