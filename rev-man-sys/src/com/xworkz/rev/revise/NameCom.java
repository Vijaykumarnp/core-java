package com.xworkz.rev.revise;

import java.util.Comparator;

public class NameCom implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
