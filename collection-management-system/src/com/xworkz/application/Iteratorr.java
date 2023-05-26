package com.xworkz.application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorr {

	public static void main(String[] args) {
		Set hh = new HashSet();
		hh.add("78");
		hh.add("sign");
		hh.add("have");
		hh.add(null);
		
		
		Iterator kk = hh.iterator();
		
		while(kk.hasNext()) {
			
		Object obj = kk.next();
		System.out.println(obj.hashCode());
		}
	}
}
