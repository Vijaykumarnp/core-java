package com.xworkz.applic;

import java.util.Comparator;

import com.xworkz.applic.typeofdatas.Custmer;

public class AdressComparator  implements Comparator<Custmer> {

	
	
	@Override
	public int compare(Custmer o1, Custmer o2) {
		// TODO Auto-generated method stub
		return o1.getAdress().compareTo(o2.getAdress());
	}

}
