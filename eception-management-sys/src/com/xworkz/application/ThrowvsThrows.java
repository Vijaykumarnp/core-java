package com.xworkz.application;

public class ThrowvsThrows {

	
	
	
public static void div(int a , int b) {
		
		
		if (b == 0) {
			throw new ArithmeticException() ;
		} else {
			System.out.println(a/b);
		}
		
		
	}

	public static void main(String[] args) throws ArithmeticException {
		
		//throw new ArithmeticException();
		div(1 , 0);
		
		
		
	}
	
	
	
}


