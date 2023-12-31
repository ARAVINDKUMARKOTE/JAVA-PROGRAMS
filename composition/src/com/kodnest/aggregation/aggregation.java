package com.kodnest.aggregation;

public class aggregation {
	public static void main(String[] args) {
		Pilot pilot = new Pilot("Arjun Teli");
		Airline airline = new Airline("AKASA", pilot);
		
		airline.operation();
		
		airline = null;//airline shutdown // NO ACTIVE REFERENCE FOR AIRLINE OBJECT // no owner
		
		pilot.fly();//still owned remain exist
	}

}
