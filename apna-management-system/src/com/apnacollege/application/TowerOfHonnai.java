package com.apnacollege.application;

public class TowerOfHonnai {

	public static void tower(int n , String scr, String helper , String destination ) {
		if(n == 1 ) {
			System.out.println("transfer disk " + n + "from " + scr + "to" + destination);;
			return;
		}
		
		
		tower(n-1 , scr , destination , helper);
		System.out.println("transfer disk " + n + "from " + scr + "to" + destination);
		tower(n-1 , helper , scr , destination );
	}
	
	public static void main(String[] args) {
		int n = 6;
		tower(n , "s" , "h" , "d");
		
	}
	
	
	
	
	
	
	
}
