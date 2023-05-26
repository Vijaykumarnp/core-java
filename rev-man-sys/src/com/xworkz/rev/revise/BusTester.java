package com.xworkz.rev.revise;

import java.util.Scanner;

public class BusTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		Bus bb = new Bus(sc.nextInt());
		System.out.println("enter the name of the pasenger");
		String name = sc.next();
		System.out.println("enter the age of the paa");
		int n = sc.nextInt();
		System.out.println("entr yje destination from bang");
		String d = sc.next();
		Pasenger pass = new Pasenger(name, n , d );
		
		
      String  i = bb.addPas(pass);
		System.out.println(i);
	
		System.out.println(bb.getPas());
		
		
	}

}
