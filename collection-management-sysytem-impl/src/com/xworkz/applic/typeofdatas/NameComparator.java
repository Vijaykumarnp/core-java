package com.xworkz.applic.typeofdatas;

import java.util.Comparator;

public class NameComparator  implements Comparator<Custmer> {

	
	@Override
	public int compare(Custmer o1, Custmer o2) {
		// TODO Auto-generated method stub
		return o1.getCusName().compareTo(o2.getCusName());
	}

}
