package com.vrl.app;

import java.util.Scanner;

import com.vrl.app.Vrl.Vrl;
import com.vrl.app.bus.Bus;

public class VrlTester {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int sizee = scanner.nextInt();
		Vrl vr = new Vrl(sizee);
		for (int i = 0; i < sizee; i++) {
			
		
		
		
		System.out.println("enter the name of the bus");
		String name = scanner.next();
		System.out.println("enter the number of the bus");
		String number = scanner.next();
		System.out.println("enter the size of the bus");
		int size = scanner.nextInt();
		System.out.println("enter the type of the bus");
		String typ = scanner.next();
		
		
		Bus buss = new Bus(name , number , size , typ);
		vr.addBus(buss);
		}
		vr.theDetails();
		//vr.getDetailsbyName(rajahamsa);
		//vr.updateNamebynumber(IRAVATHI,KA09EE4578 );
		scanner.close();
	}
}
