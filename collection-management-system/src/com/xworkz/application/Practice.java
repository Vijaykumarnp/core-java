package com.xworkz.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Practice {

	public static void main(String[] args) {
		
		List ll = new ArrayList();
		
		ll.add(23);
		ll.add(23);
		ll.add(null);
		ll.add(null);
		ll.add(24);
		Iterator lk = ll.iterator();
		while(lk.hasNext()) {
			Object objs = lk.next();
			System.out.println("Arraylist"+objs);
		}
		
		
		List lkk = new Vector();
			lkk.add(12);
			lkk.add(12);
			lkk.add(null);
			lkk.add(null);
			lkk.add(67);
			Iterator lks = lkk.iterator();
			while(lks.hasNext()) {
				Object obj = lks.next();
				System.out.println("vector"+obj);
			}
			
			List lj = new LinkedList();
			lj.add(56);
			lj.add(56);
			lj.add(null);
			lj.add(null);
			
			System.out.println(lj);
			
		
		
		
		
		
	}
	
	
	
}
