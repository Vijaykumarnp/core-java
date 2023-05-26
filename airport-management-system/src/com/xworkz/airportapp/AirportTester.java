package com.xworkz.airportapp;
import com.xworkz.airportapp.terminal.Terminal;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

import com.xworkz.airportapp.airport.Airport;
import com.xworkz.airportapp.airport.KempeGowdaAirport;
import com.xworkz.airportapp.terminal.Terminal;
//import com.xworkz.airportapp.terminal.*;
public class AirportTester {
public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = sc.nextInt();
	Airport air = new Airport(size);
	
	Airport d = new KempeGowdaAirport();
	
	KempeGowdaAirport k = (KempeGowdaAirport)d;
	
	
	for (int i = 0; i <size; i++) {
	
	
	Terminal ter = new Terminal();
	
	System.out.println("enter the name of the termina");
	ter.setName(sc.next());
	System.out.println("enter the size of the terminal");
	ter.setSizee(sc.nextInt());
	System.out.println("enter the type of terminal");
	ter.setType(sc.next());
	//System.out.println(ter.getName() + " " + ter.getSizee() + " "+ ter.getType());
	
	
	
	
	air.addTerminals(ter);
	}
	int option;
	String yes   ;
	do {
	System.out.println("enter 1 to get all the terminals");
	System.out.println("enter 2 to get a spcific terminal ");
	System.out.println("enter 3 to get updated name of the terminal with refrence of terminal type");
	System.out.println("enter 4 to get updated name with refrence of terminal");
	System.out.println("enter 5 to exit");
	
	 option = sc.nextInt();
    // yes = sc.next();
			 
   switch(option) {
   case 1 : air.getTerminal();	
   break;
   case 2 : System.out.println("enter the name to fetch data of the terminal");
             String s = sc.next();
             air.getTerminalByName(s);
   break;
   
   case 3 : System.out.println("enter the updated name of the terminal");
            System.out.println("enter the type of the terminal to update name");
                air.updateNamebyType(sc.next(), sc.next());
                break;
   case 4 : System.out.println("enter the updated name of the terminal");
            System.out.println("enter the refrence size of the terminal");
               
           air.updateTerminalnameBysize(sc.next(), sc.nextInt());
       break;
       
   case 5 : System.out.println("thank you for using this app");
   break;
       
   }
   System.out.println(" click yes to log out");
 
	}
	
	while("no" .equals(sc.next()));
	
	
	
}
}
