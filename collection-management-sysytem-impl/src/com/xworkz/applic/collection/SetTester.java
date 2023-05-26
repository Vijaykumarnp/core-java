package com.xworkz.applic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.applic.typeofdatas.Custmer;

public abstract class SetTester {

	public static void main(String[] args) {
		
	
	Set<Custmer> list =  new TreeSet<Custmer>();
	list.add(new Custmer("vikas", 2, 45, "bankok", "arkalgud"));
	list.add(new Custmer("vijay" , 1 , 23,"arakalgus" , "nygere"));
	list.add(new Custmer("vikram" , 3 , 67 , "bannw" , "hhaj"));
	Iterator<Custmer> kk = list.iterator();
	
	while(kk.hasNext()) {
		Custmer cus = kk.next();
		System.out.println(cus);
	}
	
	}
	
}
