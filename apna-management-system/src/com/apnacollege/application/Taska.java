package com.apnacollege.application;

public class Taska {

	
	public static void main(String[] args) {
		
		String ss = "hh ll";
		String sss = "";
		char c[] = ss.toCharArray();
		for (int i = 0; i < c.length; i++) {
		
		if(c[i] != ' ') {
			
			ss = sss+c[i];
			
			System.out.print(ss);
		}
		}
		
		
		
	}
	
	
	
}
