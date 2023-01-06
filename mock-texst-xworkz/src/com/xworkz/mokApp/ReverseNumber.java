package com.xworkz.mokApp;

public class ReverseNumber {

	
	public static void main(String[] args) {
		int i = 1234 ; 
		int j = 0 ;
		int n;
		
		while (i >0) {
			
			n = i%10;
			j = j*10 + n;
			i = i/10;
			
		}
		System.out.println(j);
		
	}
	
	
	
}

