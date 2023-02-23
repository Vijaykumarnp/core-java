package com.xworkz.airsapp.airport;

import com.xworkz.airsapp.exception.TerminalNotFound;
import com.xworkz.airsapp.terminals.Terminal;

public interface Airport {
	
	public void addTerminals(Terminal terminal);	
	public void getTerminal();
	public Terminal getTerminalByName(String  name) ;
	public Terminal updateTerminalnameBysize(String newName , int size);
	
	
}
