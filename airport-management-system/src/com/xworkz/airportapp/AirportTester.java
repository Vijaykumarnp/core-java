package com.xworkz.airportapp;

import java.util.Scanner;

import com.xworkz.airportapp.airport.Airport;
import com.xworkz.airportapp.terminal.Terminal;

public class AirportTester {
public static void main(String a[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = scanner.nextInt();
	Airport air = new Airport(size);
	for (int i = 0; i <size; i++) {
	System.out.println("enter the name of the terminal");	
	String name= scanner.next();
	System.out.println("enter the size of the terminal");
	int size1 = scanner.nextInt();
	System.out.println("type of the terminal");
	String type = scanner.next();
	
	Terminal ter = new Terminal(name,size1 , type);
	air.addTerminals(ter);
	}
	air.getTerminal();
	//air.getTerminalByName("fifa");
	air.updateTerminalnameBysize("fitch", 5);
}
}
