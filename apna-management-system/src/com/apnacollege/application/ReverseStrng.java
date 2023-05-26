package com.apnacollege.application;

public class ReverseStrng {

	public static void rev(String word , int ind) {
		if(ind == 0) {
			System.out.println(word.charAt(ind));
			return;
			
		}
		
		
		System.out.print(word.charAt(ind));
		rev(word , ind-1);
		
	} 
	
	public static void main(String[] args) {
		String word = "mock";
		rev(word , word.length()-1);
	}
	
}
