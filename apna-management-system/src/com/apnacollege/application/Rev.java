package com.apnacollege.application;

public class Rev {

	public static int print(int a , int b , int n) {
		
		if(n == 0) {
			return 0;
		}
		
		int c = a+b;
		System.out.println(c);
		print(b , c , n-1);
	
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int n= 5;
		//print(a , b,n-2);
		float j = b;
		float k = j;
		boolean l = true;
		System.out.println(k);
	
	}
}
