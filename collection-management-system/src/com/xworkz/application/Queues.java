package com.xworkz.application;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class Queues {

	
	public static void main(String[] args) {
		
		Queue k = new PriorityQueue();
		k.add("k");
		k.add("28");
		k.add("a");
		//k.add(null);
		
		
		Iterator lk = k.iterator(); 
            
while(lk.hasNext()) {
			System.out.println("all data removed");
			k.remove();
		}
		
		
		
		while(lk.hasNext()) {
			Object ok = lk.next();
			
			System.out.println(ok);
		}	
}
}
