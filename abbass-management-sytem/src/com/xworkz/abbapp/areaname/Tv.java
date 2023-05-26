package com.xworkz.abbapp.areaname;

public class Tv implements Switch {

	@Override
	public String toOnOrOff() {
		System.out.println("to on or off the tv");
		return "switch";
	}

}
