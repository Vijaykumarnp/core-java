package com.xworkz.application;

public class Productofele {

	public static void main(String[] args) {
		
		int a[] = {1 ,2 ,3 ,4 ,5};
		int pr = 1;
		for (int i = 0; i < a.length; i++) {
			pr = a[i]*pr;
		}
		System.out.println(pr);
	}
	
}
