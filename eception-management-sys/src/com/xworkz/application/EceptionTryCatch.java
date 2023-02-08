package com.xworkz.application;

import java.io.*;


public class EceptionTryCatch {

	public static void main(String[] args) {
		System.out.println("main strted ");
		
		divide(1 , 0);
		System.out.println("main ended");
	}
	
	
	public static int divide(int i , int j) {
		System.out.println("divide method started");

		try{System.out.println(i/j);
		}catch(Exception erro) {
			System.out.println("cannot divide a number by zero");
		}
		System.out.println("divide method ended");
		return 1;
	}
	
	
}
