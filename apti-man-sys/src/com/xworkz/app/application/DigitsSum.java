package com.xworkz.app.application;

public class DigitsSum {
public static void main(String[] args) {
	int i = 19754478;
	int sum = 0 ;
	
	while (i>0) {
		
	  int temp = i%10;	
	    sum = sum+temp;
	    i = i/10;
		
	}
	System.out.println(sum);
	
	
}
	
}
