package com.xworkz.application;

public class WhiteSpaces {

	public static void main(String[] args) {
		String a  = "sai pg";
		
		char[] c  = a.toCharArray();
		String b = " ";
		
		for (int i = 0; i < c.length; i++) {
		if(c[i] != ' ') {
		 b = b+c[i];

	}
		}
		 System.out.println(b);
			
	}
}
