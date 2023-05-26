package com.xworkz.application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTester {

	
	public static void main(String[] args) {
		
		List hh = new LinkedList();
	
		hh.add(45);
		hh.add("str");
		hh.add(2);
		hh.add(3, "");
		hh.add(4 , "love");
		hh.add(5 , "you");
		
		System.out.println(hh);
		System.out.println(hh.remove(2));//object remove
		System.out.println(hh.remove(2));//index remove
		hh.add(null);
	    hh.add(null);
	    System.out.println(hh);
		
		//hh.clear();
		//System.out.println(hh);
		for(Object obj : hh) {
			
			//hh.add(0, 99); -- we cannot achive this by list it can be achived by iterator method   (concerentmodification exception)
			System.out.println(obj );//System.out.print(obj + " ,");
			//System.out.println("hjsj"+hh.getClass());
		}
		System.out.println(hh.get(0));
		//System.out.println("hjsj"+hh.getClass());
		System.out.println(hh.lastIndexOf(null));
	
	}
	
}
