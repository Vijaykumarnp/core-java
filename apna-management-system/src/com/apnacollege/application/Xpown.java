package com.apnacollege.application;

public class Xpown {

	
	public static int pow(int x , int n) {
		if(x == 0) {
			return 1;	
		}
		if(n == 0 ) {
			
			return 1;
		}
		
		
		
		
		int xPowN = pow(x , n-1 );
		int xpowN1 = x*xPowN;
		return xpowN1;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int x = 2 ;
				int n = 5 ;
		
			int d =	 pow(x , n);
		System.out.println(d);
		
	}
	
	
	
	
}
