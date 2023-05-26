package com.xworkz.app.application;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 5678 ; 
		int revres = 0 ;
		int lastDigit;
		
		while (i >0) {
			
			lastDigit = i%10;
			revres = revres*10 + lastDigit;
			i = i/10;
			
		}
		System.out.println(revres);
		
	}
}
