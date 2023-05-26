package com.xworkz.abbapp.areaname;

public class TeaBusiness extends Business{
	
	TeaBusiness t;
@Override
	public  TeaBusiness invest() {
		System.out.println("child class method");
		return t;
	}
	
}
