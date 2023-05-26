package com.xworkz.application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {

	
	public static void main(String[] args) {
		
		Object kl = new Object();
		
		Object l = null;
		System.out.println(l == kl);
		
		Set k = new LinkedHashSet();
		k.add("90");
		k.add("true");
		k.add("k");
		k.add("null");
		k.add("90");
		k.add("true");
		Iterator lkk = k.iterator();
		
		while(lkk.hasNext()) {
			Object objs = lkk.next();
			System.out.println(objs);
		}
		
		
		while(lkk.hasNext()) {
			Object ob = lkk.next();
			
		}
		
		
		//System.out.println(k);
		Set kk = new HashSet();
		
		kk.add("90");
		kk.add("true");
		kk.add("k");
		kk.add("null");
		kk.add("90");
		kk.add("true");
		
		//System.out.println(kk);
		
		Iterator jj = kk.iterator();
		while(jj.hasNext()) {
		Object obj =	jj.next();
			System.out.println(obj);
		}
		
	}
	
}
