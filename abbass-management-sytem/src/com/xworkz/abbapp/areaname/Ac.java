package com.xworkz.abbapp.areaname;

public abstract class Ac implements Switch {

	@Override
	public String toOnOrOff() {
		System.out.println("to on or off the Ac");
		return "switch";
	}
}