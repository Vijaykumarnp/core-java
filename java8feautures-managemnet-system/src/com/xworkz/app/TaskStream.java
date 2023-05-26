package com.xworkz.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
public class TaskStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List< String> l = new ArrayList<String>();
		
		l.add("habibi");
		l.add("krishna");
		l.add("kaanaa");
		l.add("balu");
		l.add("hamsa");
		l.add("kabza");
		l.add("bankpokk");
		
		System.out.println("enter  the string data");
	l.stream().filter(f -> f.equals(sc.next())).forEach(f -> System.out.println(f));
		
		
		
	}
	
	
}
