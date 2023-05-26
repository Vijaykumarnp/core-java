package com.xworkz.airportapp.airport.exception;

public class TerminalNotFound extends RuntimeException{

	public TerminalNotFound(String message) {
		toString();
	}
	
	@Override
	public String toString() {
		
		return "TerminalNotFound";
	}
	
	
}
