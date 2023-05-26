package com.xworkz.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class ListTask {

	public static void main(String[] args) {
		
		List list =  new ArrayList();
		 list.add("movies");
		 list.add("rakkasa");
		 list.add(2, 33);
		 list.add(3, "tesla");
		 list.add(4, 56);
		 list.add(null);
		String j = new String();
		j.hashCode();
		 
		 
		List list1 = new LinkedList<>();
		list1.add(0, 67);
		list1.add(1, "true");
		list1.add(2, 89);
		list1.add(3, 'g');
		list1.add(4, 'g');
		list1.add(5, null);
		list1.add(null);
		
		list.addAll(list1);
		for(Object obj : list) {
			System.out.println(obj);
		}
	System.out.println(	list.containsAll(list1));
	System.out.println(list.removeAll(list1));
	System.out.println(list);
	System.out.println(list.equals(list1));
		System.out.println(list.get(1));
		System.out.println(list.set(1, " bike"));
		System.out.println(list);
		System.out.println(list.listIterator());
		System.out.println(list.toArray());
		try {
		System.out.println(list.removeIf(null));
		
		}catch(NullPointerException tt) {
			System.out.println("not deal with null");
		}
		System.out.println(list.iterator());
		System.out.println(list1.hashCode());
		System.out.println(list1.lastIndexOf(null));
	  }
	}
