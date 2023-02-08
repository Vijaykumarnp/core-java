package com.xworkz.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fileee {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			
		
	System.out.println("enter the new file name");
		File ff = new File(sc.next());
		
		try {
			ff.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
	
}
