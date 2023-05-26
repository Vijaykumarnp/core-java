package com.xworkz.hosapp.exception;

public class NameNotFoundException extends RuntimeException {

	
	public NameNotFoundException() {
		toString();
	}
	
	@Override
	public String toString() {
		System.out.println("NameNotFoundException");
		return "patient was not found for the given name";
	}
	
}
