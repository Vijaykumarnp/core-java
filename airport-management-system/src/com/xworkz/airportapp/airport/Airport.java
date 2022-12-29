package com.xworkz.airportapp.airport;

import com.xworkz.airportapp.terminal.Terminal;

public class Airport {
Terminal terminal[] ; 
int ind;

public Airport(int size) {
	System.out.println("the object airport is created");
	terminal= new Terminal[size];
	
	
}

public void addTerminals(Terminal terminal) {
	System.out.println("adding terminal to airport");
	if(terminal.name != null) {
		this.terminal[ind++] = terminal;
		System.out.println("terminal is added");
		
	}
}
public void getTerminal() {
	for(int i=0 ; i<terminal.length ; i++) {
		System.out.println(terminal[i].name + " "+ terminal[i].size + " "+ terminal[i].type);
		
		
	}
}

public Terminal getTerminalByName(String  name) {
System.out.println("inside the getTerminalsByName method");
	for(int i=0 ; i<terminal.length ; i++) {
		if(terminal[i].name == name) {
			System.out.println("the name is matiching proceed data");
			System.out.println(terminal[i].name + " " + terminal[i].size + " " + terminal[i].type);
			return terminal[i];
		}
		
		
	}
	return null;	
}
public Terminal updateTerminalnameBysize(String newName , int size) {
	System.out.println("inside the  updateTerminalnameBysize");
	for(int i=0 ; i<terminal.length ; i++) {
		if(terminal[i].size == size) {
			System.out.println("the size is matched update the data ");
			System.out.println("the current name is  " + terminal[i].name);
		terminal[i].name = newName;
		System.out.println("the updated name is " + terminal[i].name);
		return terminal[i];
		}
		
		
	}
	return null;
}


}
