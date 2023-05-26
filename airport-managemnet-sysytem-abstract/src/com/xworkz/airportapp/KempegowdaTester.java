package com.xworkz.airportapp;

import java.util.Scanner;

import com.xworkz.airsapp.airport.Airport;
import com.xworkz.airsapp.terminals.Terminal;
import com.xworkz.airsapp.airport.KempegowdaImpl;
import com.xworkz.airsapp.exception.TerminalNotFound;

public class KempegowdaTester {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = sc.nextInt();
	KempegowdaImpl air = new KempegowdaImpl(size);
	
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

	System.out.println("enter 3 to get updated name with refrence of terminal");
	System.out.println("enter 4 to exit");
	
	 option = sc.nextInt();
    // yes = sc.next();
			 
   switch(option) {
   case 1 : air.getTerminal();	
   break;
   case 2 : System.out.println("enter the name to fetch data of the terminal");
   
   try {
             String s = sc.next();
             air.getTerminalByName(s);
   }catch(TerminalNotFound k) {
	   k.printStackTrace();
   }finally{
	   if(sc != null) {
		
	   }
   }
   break;
   
   
   case 3 : System.out.println("enter the updated name of the terminal");
            System.out.println("enter the refrence size of the terminal");
            try {   
           air.updateTerminalnameBysize(sc.next(), sc.nextInt());
            }catch(TerminalNotFound k) {
            	k.printStackTrace();
            }finally {
            	if(sc != null) {
            		
            	}

            }
       break;
       
   case 4 : System.out.println("thank you for using this app");
   break;
       
   }
   System.out.println(" click yes to log out");
 
	}
	
	while("no" .equals(sc.next()));
	
}
}

	
	
	
	

