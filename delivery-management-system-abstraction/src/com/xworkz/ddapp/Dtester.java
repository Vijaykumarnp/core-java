package com.xworkz.ddapp;

import java.util.Scanner;

import com.xworkz.ddapp.dboys.Dboys;
import com.xworkz.ddapp.deliveryy.Swiggy;


public class Dtester {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = sc.nextInt();
	      Swiggy dd = new Swiggy(size);
	      
	      for (int i = 0; i < size; i++) {
			
		
	      
	      System.out.println("enter name");
			System.out.println("enter age");
			System.out.println("enter v number");
			System.out.println("enter contact");
			
			Dboys boyss = new Dboys(sc.next(),sc.nextInt() , sc.next() , sc.nextLong() );
			
	      Dboys boy = new Dboys();
		     System.out.println(  dd.addBoys(boyss));
	      }
	      dd.getBoys();
	   
	}
}
