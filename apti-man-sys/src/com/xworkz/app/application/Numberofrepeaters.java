package com.xworkz.app.application;

public class Numberofrepeaters {

	
	public static void main(String[] args) {
		String a = "hello world";
		char c[] = a.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			int count = 0 ;
			for (int j = 0; j < c.length; j++) {
				if(c[i] == c[j]) {
					
					count = count+1;
				
				}
			
			}
			System.out.println(count + " " + c[i]);
			
		}
	
	}
	
	
}
