package com.xworkz.airportapp.airport;

import com.xworkz.airportapp.exception.TerminalNotFound;
import com.xworkz.airportapp.terminal.Terminal;

public class Airport extends Object {
Terminal terminal[] ; 
int ind;

public Airport(int size) {
	System.out.println("the object airport is created");
	terminal= new Terminal[size];
	
	
}

public Airport() {
	System.out.println("hdfjd");
}

public void addTerminals(Terminal terminal) {
	System.out.println("adding terminal to airport");
	if(terminal.getName() != null) {
		this.terminal[ind++] = terminal;
		System.out.println("terminal is added");
		
	}
}
public void getTerminal() {
	for(int i=0 ; i<terminal.length ; i++) {
		System.out.println(terminal[i]);
	}
}

public Terminal getTerminalByName(String  name)  {
System.out.println("inside the getTerminalsByName method");
	for(int i=0 ; i<terminal.length ; i++) {
		if(terminal[i].getName() .equals(name) ) {
			System.out.println("the name is matiching proceed data");
			System.out.println(terminal[i].getName() + " "+ terminal[i].getSizee()+ " "+ terminal[i].getType());
			return terminal[i];
		}
	}
	return null;	
}
public Terminal updateTerminalnameBysize(String newName , int size) {
	System.out.println("inside the  updateTerminalnameBysize");
	for(int i=0 ; i<terminal.length ; i++) {
		if(terminal[i].getSizee() == size) {
			System.out.println("the size is matched update the data ");
			System.out.println("the current name is  " + terminal[i].getName());
		terminal[i].setName(newName);
		System.out.println("the updated name is " + terminal[i].getName());
		return terminal[i];
		}
		
		
	}
	return null;
}
//


public Terminal updateNamebyType(String newName , String type) {
	System.out.println("inside the update name by terminal method");
	for (int i = 0; i < terminal.length; i++) {
	if(terminal[i].getType() .equals(type)) {
		System.out.println("the current name is"+terminal[i].getName());
		terminal[i].setName(newName);
		System.out.println("the updated name is " + terminal[i].getName());
		return terminal[i];
	}	
	}
	return null;
}


public long doBusiness() {
	System.out.println("parent");
	return 989284;
}



}
