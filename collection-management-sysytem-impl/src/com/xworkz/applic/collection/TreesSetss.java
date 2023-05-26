package com.xworkz.applic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.applic.typeofdatas.Custmer;
import com.xworkz.applic.typeofdatas.NameComparator;

public class TreesSetss {

	public static void main(String[] args) {
		
		List<Custmer> kk = new ArrayList<Custmer>();
		kk.add(new Custmer("jaga", 2, 23, "salgoplu", "arkalgud"));
		kk.add(new Custmer("ll" , 4 ,89 , "bjha" , "ll"));
		kk.add(new Custmer("abhi" ,1,23,"archil" , "jjd" ));
		kk.add(new Custmer("boss", 3, 45, "jj", "ii"));
		
	   Iterator ll = kk.iterator();
	   
	   //Collections.sort(kk);
	  // Collections.sort(kk, new NameComparator());
	   
	  for (Custmer custmer : kk) {
		System.out.println(custmer);
	}
	   
		
		
	}
	
	
	
	
}
