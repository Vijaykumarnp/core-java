package com.xworkz.application;

public class RemoveWhiteSpacese {

	public static void main(String[] args) {
	
		String j = "java   is   a   robust ";
		
		String str = "";
		
		char [] c = j.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			if(c[i] != ' ') {
				j = c[i]+str;
				System.out.print(j);
			}
			
			
		}
		
		
	}
	}
		