package com.xworkz.abbapp.areaname;

public abstract class  Fan implements Switch{

	
	public Fan() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toOnOrOff() {
		System.out.println("to on or off the fan");
		return "switch";
	}
	
	//public abstract String threeWings();

}
