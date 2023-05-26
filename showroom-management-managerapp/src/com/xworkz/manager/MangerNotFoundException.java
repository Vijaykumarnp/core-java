package com.xworkz.manager;

public class MangerNotFoundException extends RuntimeException{

	public MangerNotFoundException(String message) {
		toString() ;
	}
	
	@Override
	public String toString() {
		
		return "MangerNotFoundException";
	}
	
	
}
