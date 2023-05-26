package com.xworkz.applic.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.applic.AdressComparator;
import com.xworkz.applic.typeofdatas.Custmer;

public class ArrayList1 {

	
	
	public static void main(String[] args) {
		
		List<Custmer> list = new ArrayList<Custmer>();
		list.add(new Custmer("ashu" , 2 , 23 ,"arkalgud" , "bengal"));
		list.add(new Custmer("aish" , 1 , 24 , "west bangal " , "ark"));
		
		//Collections.sort(list);
		Collections.sort(list, new AdressComparator());
		Iterator itr =  list.iterator();
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		
	}
	
}
