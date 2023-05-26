package com.xworkz.dto.comparators;

import java.util.Comparator;

import com.xworkz.dto.TerminalDTO;

public class SizeComparator implements Comparator<TerminalDTO> {

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		// TODO Auto-generated method stub
		return o1.getSize()-o2.getSize();
	}

}
