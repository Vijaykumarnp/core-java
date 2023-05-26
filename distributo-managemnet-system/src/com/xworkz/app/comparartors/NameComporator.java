package com.xworkz.app.comparartors;

import java.util.Comparator;

import com.xworkz.app.constant.Gender;
import com.xworkz.app.dto.SalesPersonDTO;

public class NameComporator implements Comparator<SalesPersonDTO> {

	

	@Override
	public int compare(SalesPersonDTO o1, SalesPersonDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
