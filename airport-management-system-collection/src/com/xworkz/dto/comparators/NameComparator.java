package com.xworkz.dto.comparators;

import java.util.Comparator;

import com.xworkz.dto.TerminalDTO;

public class NameComparator implements Comparator<TerminalDTO> {

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
