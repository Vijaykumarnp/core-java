package com.xworkz.app.application;

public class BarTester {

	
	public static void main(String[] args) {
		
		Bar baa = new Bar(1 , "thirsha" , "ark" , "shammana" );
		Bar ba = new Bar(1 , "lakshmi" , "ark" , "ranganna" );
		
		Amigo a = new Amigo();
		
		System.out.println(baa);
		System.out.println(ba);
	System.out.println(ba.equals(baa));
	//System.out.println(a.equals(ba));
	
	System.out.println(ba.hashCode());
	System.out.println(baa.hashCode());
	
	
	}
	
	
}
