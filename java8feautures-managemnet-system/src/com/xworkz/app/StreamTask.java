package com.xworkz.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
		l.add(767);
		l.add(98238);
		l.add(45);
		l.add(9);
		l.add(7);
		l.add(53);
		l.add(6532);
		l.add(6832);
		l.add(23);
		l.add(92);
		l.add(100);
		l.add(26);
		l.add(652);
		l.add(3287);
		l.add(983);
		
	System.out.println(	l.stream().max(Comparator.comparing(Integer :: valueOf)));
		//l.stream().forEach(j -> System.out.println(j));
		System.out.println("number greater than hundred");
		System.out.println(l.stream().filter(f -> (f>100  )).collect(Collectors.toList()));
		
	//System.out.println(	l.stream().filter(j -> (j%2 == 0)).collect(Collectors.toList()));
		System.out.println("numbers less than hundread ");
	System.out.println(l.stream().filter(f -> (f<100  )).collect(Collectors.toList()));
	}
	
	
}
