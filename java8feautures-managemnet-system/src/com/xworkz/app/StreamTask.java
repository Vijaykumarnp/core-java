package com.xworkz.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {

	
	public static void main(String[] args) {
		
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(400);
		l.add(2);
		l.add(8728);
		l.add(34);
		l.add(567);
		l.add(12);
		l.add(45);
		l.add(89);
		
		
		//l.stream().forEach(j -> System.out.println(j));
		System.out.println("number greater than hundred");
		System.out.println(l.stream().filter(f -> (f>100  )).collect(Collectors.toList()));
		
	//System.out.println(	l.stream().filter(j -> (j%2 == 0)).collect(Collectors.toList()));
		System.out.println("numbers less than hundread ");
	System.out.println(l.stream().filter(f -> (f<100  )).collect(Collectors.toList()));
	
		
		
		
	}
	
	
}
