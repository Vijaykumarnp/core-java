package com.xworkz.app.application;

public class Sttring {

	
	
	public static void main(String[] args) {
		
		String h = "vijay kumar";
		String u = "vinay kumar";
		String kk = "VIJAY KUMAR";
		char c = h.charAt(0);
 	 
		System.out.println(c);
		
		
		
		
		int b = h.codePointAt(7);
		System.out.println("codepoint at" + b);
	System.out.println("compare method" +u.compareTo(h));
	
	
	String k = h.substring(6);
	System.out.println("substring " + k);
	
	String hf =h.substring(3, 8);
	
	System.out.println("substring of int " + hf);
	int kkk = h.compareToIgnoreCase(hf);
	System.out.println(kkk);
	
	
	
	
	}
	
	
}
