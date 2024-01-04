package com.abstractClassEx1;
//abstract class
abstract class Car {
	void start()
	{
		System.out.println("Car is getting started");
	}
	void stop()
	{
		System.out.println("Car is getting stopped");
	}
	//abstract method
	abstract void refuel();

}
