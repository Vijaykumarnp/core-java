package com.xworkz.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		Collection h = new ArrayList();
		h.add("iji");
		h.add(90);
		h.add('n');
		h.add("");
		System.out.println(h.contains(88));
		System.out.println("size before remove" +h.size());
		System.out.println(h.remove('n'));
		System.out.println(h.equals("iji"));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h);
		//System.out.println(h.containsAll(h));
		
		Collection j = new Vector();
		j.add("iji");
		j.add(90);
		j.add('n');
		j.add("");
		System.out.println(h.containsAll(j));
		      
		}
	}
	

