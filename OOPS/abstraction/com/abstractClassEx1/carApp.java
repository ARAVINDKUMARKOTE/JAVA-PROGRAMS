package com.abstractClassEx1;

public class carApp {
	public static void doActivity( Car cr)
	{
		cr.start();
		cr.stop();
		cr.refuel();
	}
	public static void main(String[] args) {
		
		electricCar ec=new electricCar();
		petrolCar pc=new petrolCar();
		dieselCar dc=new dieselCar();
		
		
		doActivity(ec);
		doActivity(pc);
		doActivity(dc);
		
	}

}
