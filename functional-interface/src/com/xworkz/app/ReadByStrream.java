package com.xworkz.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReadByStrream {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		list .add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		
		Iterator<Integer> k = list.iterator();
		while(k.hasNext()) {
			Integer in = k.next();
			if(in%2 == 0) {
				System.out.println("even " +in);
			}else {
				System.out.println("odd" +in);
			}
			
		}
		
		System.out.println("using stream ");
		
		list.stream().forEach(g -> System.out.println(g));
		System.out.println("filtering");
		System.out.println(list.stream().filter(a -> (a%2 == 0)).collect(Collectors.toList()));
		
		
		
	}
}
