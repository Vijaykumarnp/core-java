package com.xworkz.airsapp.airport;

import com.xworkz.airsapp.exception.TerminalNotFound;
import com.xworkz.airsapp.terminals.Terminal;

public class KempegowdaImpl implements Airport{

	
	Terminal terminal[] ; 
	int ind;
 public KempegowdaImpl(int size) {
		// TODO Auto-generated constructor stub
	
		System.out.println("the object airport is created");
		terminal= new Terminal[size];
		
		
	}

	public KempegowdaImpl() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void addTerminals(Terminal terminal) {
		System.out.println("adding terminal to airport");
		if(terminal.getName() != null) {
			this.terminal[ind++] = terminal;
			System.out.println("terminal is added");
			
		}
	}

	@Override
	public void getTerminal() {
		for(int i=0 ; i<terminal.length ; i++) {
			System.out.println(terminal[i]);
		}
		
	}

	@Override
	public Terminal getTerminalByName(String name) throws TerminalNotFound {
		System.out.println("inside the getTerminalsByName method");
		for(int i=0 ; i<terminal.length ; i++) {
			if(terminal[i].getName() .equals(name) ) {
				System.out.println("the name is matiching proceed data");
				System.out.println(terminal[i].getName() + " "+ terminal[i].getSizee()+ " "+ terminal[i].getType());
				return terminal[i];
				}else {
				throw new TerminalNotFound("no terminal found in a given name ");
			}
		}
		return null;
	}
	
	
	@Override
	public Terminal updateTerminalnameBysize(String newName, int size) throws TerminalNotFound{
		System.out.println("inside the  updateTerminalnameBysize");
		for(int i=0 ; i<terminal.length ; i++) {
			if(terminal[i].getSizee() == size) {
				System.out.println("the size is matched update the data ");
				System.out.println("the current name is  " + terminal[i].getName());
			terminal[i].setName(newName);
			System.out.println("the updated name is " + terminal[i].getName());
			return terminal[i];
			}else {
				System.out.println(	"no size found in a given size for upadtion of the name ");
				throw new TerminalNotFound("no size found in a given size for upadtion of the name ");
			
			}
		
		}
		return null;
	}
}
