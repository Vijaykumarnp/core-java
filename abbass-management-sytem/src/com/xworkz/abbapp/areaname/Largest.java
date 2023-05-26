package com.xworkz.abbapp.areaname;

public class Largest {

	
	public static void main(String[] args) {
		int n[] = {8 , 3,44,67,9102};
		
		int max = n[0];
		
		for (int i = 0; i < n.length; i++) {
			
			if(n[i]<max) {
				max = n[i];
			}
			
			
		}
		
		System.out.println(max);
		
	}
}
