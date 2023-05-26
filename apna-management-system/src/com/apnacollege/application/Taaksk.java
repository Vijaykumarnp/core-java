package com.apnacollege.application;

public class Taaksk {

	public static void main(String[] args) {
		String h = "vijaykumar";
		char c[] = h.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int ch = 0;
			for (int j = 0; j < c.length; j++) {
				
				if(c[i] == c[j]) {
					
					ch = ch+1;
				
					System.out.println(c[i]+ " "+ ch);
					
				}
				
			}
			
			
			
			
		}
	
	}
	
	
}
