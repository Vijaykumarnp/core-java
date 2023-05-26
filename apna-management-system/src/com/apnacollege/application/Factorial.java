package com.apnacollege.application;

public class Factorial {
	
	public static int fact(int n) {
		
		if(n == 1) {
			return 1;
			
		}
		
		
		
		int fact1 = fact(n-1);
		int fact2 = n*fact1;
		//System.out.println(n);
		
		return fact2;
	}
	
	
	
	

	public static void main(String[] args) {
		int ans = fact(5);
		System.out.println(ans);
	}
	
	
	
}
