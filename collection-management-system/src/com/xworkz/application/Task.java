package com.xworkz.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class Task {

	
	public static void main(String[] args) {
		Collection j = new ArrayList();
		j.add("vikram");
		j.add(23);
		j.add("Hassan");
		j.add("race");
		j.add("base");
		j.add("bhagvan");
		j.add("hero");
		j.add("shersha");
		j.add("bhasha");
		Collection k = new Vector<>();
		k.add(11);
		k.add(90);
		k.add(12);
		k.add(34);
		k.add(89);
		k.add(56);
		k.add(23);
		k.add(12);		
		k.add(34);
		k.add(67);
		Collection l = new LinkedList<>();
		l.add(8892929828888l);
		l.add(789299298999l);
		l.add(6728286788787l);
		l.add(92727827665656l);
		l.add(576728288988l);
		l.add(78282288888888l);
		l.add(92728728976l);
		l.add(67728287988l);
		l.add(99282827655l);
		
		Collection hj = new Vector();
		hj.add("vikram");
		hj.add(23);
		hj.add("Hassan");
		hj.add("race");
		hj.add("base");
		hj.add("bhagvan");
		hj.add("hero");
		hj.add("shersha");
		hj.add("bhasha");		
		System.out.println("if j conatins 2"+j.contains(2));
		System.out.println("is the array empty"+j.isEmpty());
		System.out.println("size "+j.size());
		System.out.println(l.remove(672828));
		System.out.println(l.isEmpty());
		System.out.println(l.containsAll(j));
		System.out.println(l.equals(9928282));
		System.out.println(k.contains(12));
		System.out.println(k.containsAll(l));
		System.out.println(j.containsAll(hj));
		System.out.print(j.hashCode());
		System.out.println(j.removeIf(null));
		j.
			}
}
