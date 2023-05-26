package com.xworkz.app.application;

public class Testing {

	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
	
	
	public static void main(String[] args) {
		
		Testing j =  new Testing();
		System.out.println("obj created");
		j = null;
		System.out.println("make the obj as null");
		System.gc();
		System.out.println("calling gc method");
		
		
		
		
		
	}
	
	
	
}
