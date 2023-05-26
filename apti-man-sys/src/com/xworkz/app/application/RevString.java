package com.xworkz.app.application;

public class RevString {

	
	
	public static void main(String[] args) {
		
		String a = "Sawwer";
		
		int count = 0 ;
		char[] c = a.toCharArray();
		for (int i = c.length-1 ; i >= 0 ; i--) {
			
			System.out.println(c[i]);
			count = count+1;
		}
		
		System.out.println(count);
		
		
		
	}
	
	
}
