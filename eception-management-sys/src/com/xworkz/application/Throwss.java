package com.xworkz.application;

import java.io.File;
import java.io.IOException;

public class Throwss {

	public static void main(String[] args) {
	
		System.out.println("main started");
		try {
					m1();
				} catch (Exception e) {
					e.printStackTrace();
				}
			System.out.println("main ended");
	}
	private static void m1() throws ClassNotFoundException, IOException {
		System.out.println("m1 strted");
		m2();
		System.out.println("m1 ended");
		
	}

	private static void m2() throws ClassNotFoundException, IOException {
		System.out.println("m2 strted");
		m3();
		File filee = new File("gg");
		filee.createNewFile();
		
		System.out.println("m2 ended");
	}

	private static void m3() throws ClassNotFoundException {
		System.out.println("m3 strted");
	Class cls =	Class.forName("com.xworkz.application.Throwss");
		System.out.println("m3 ended");
	}
}
