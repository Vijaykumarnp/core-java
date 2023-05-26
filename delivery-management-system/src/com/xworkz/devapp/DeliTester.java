package com.xworkz.devapp;

import java.util.Scanner;

import com.xworkz.devapp.deliryboys.Dboy;
import com.xworkz.devapp.deliveryapp.DeliveryApp;
import com.xworkz.devapp.deliveryapp.Swiggy;

public class DeliTester {

	
	
	

	public DeliTester() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		 
		
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the size");
		int size = sc.nextInt();
		DeliveryApp bb = new DeliveryApp(size);
		
		DeliveryApp gg = new Swiggy();
	
		
		Swiggy sww = (Swiggy)gg;
		sww.order();
	
	
		for (int i = 0; i < size; i++) {
			
		
		
		System.out.println("enter name");
		System.out.println("enter age");
		System.out.println("enter v number");
		System.out.println("enter contact");
		
		Dboy boyss = new Dboy(sc.next(),sc.nextInt() , sc.next() , sc.nextLong() );
		
		bb.addBoys(boyss);
		}
		
		System.out.println("enter 1 to get boys in the app ");
		System.out.println("enter 2 to get a  delivery boy name ");
		System.out.println("enter 3 to updat the age ");
		int op = sc.nextInt();
		
		switch(op) {
		case 1 : bb.getBoys();
		break;
		case 2 : System.out.println("");
			bb.getDetailsbyName(sc.next());
		break;
		case 3 : System.out.println("enter the updated name");
		System.out.println("enter the refrence age");
			bb.updateNamebyage(sc.next(), sc.nextInt());
			break;
		case 4 : System.out.println();
			
			
			
		}
	
	}
	
}
