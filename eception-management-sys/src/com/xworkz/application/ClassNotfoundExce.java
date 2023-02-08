package com.xworkz.application;

import java.io.File;
import java.io.IOException;

public class ClassNotfoundExce {

	
	public static void main(String[] args) {
		
		System.out.println("main started");
	try {
		Class jj =	Class.forName("com.xworkz.application.ClassNotfoundExce");
		System.out.println(jj);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	File fi = new File("myfil.txt");
	
	
	      try {
			fi.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("main ended");
	}
	
}
