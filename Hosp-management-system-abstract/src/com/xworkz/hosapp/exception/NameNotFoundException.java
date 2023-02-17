package com.xworkz.hosapp.exception;

public class NameNotFoundException extends RuntimeException {

	
	public NameNotFoundException() {
		toString();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "patient was not found for the given name";
	}
	
	
}
