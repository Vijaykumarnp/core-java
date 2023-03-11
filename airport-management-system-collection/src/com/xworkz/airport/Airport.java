package com.xworkz.airport;

import java.util.List;

import com.xworkz.dto.TerminalDTO;

public interface Airport {

	
	public boolean saveTerminal(TerminalDTO dto) throws Exception;
	public List getTerminal() throws Exception;
	
}
