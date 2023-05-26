package com.xworkz.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		
	
	List<Employee> j = new ArrayList<Employee>();
	
	j.add(new Employee(1 , "Ram" , 56 , "ban"  , 4000000 ));
	j.add(new Employee(2, "sham", 28, "man", 300000));
	j.add(new Employee(3, "soma", 67, "hsn", 6000000));
	j.add(new Employee(4, "rama", 29, "belgav", 40000));
	
	
	//max salary
	System.out.println(j.stream().max(Comparator.comparing(Employee :: getSalary)));
	                                                                                                                         
	System.out.println(j.stream().min(Comparator.comparing(Employee :: getSalary)));
	
	System.out.println(j.stream().filter(f -> f.getSalary()>300000 )System.out.println(f));
	
	//acending order
	List<Employee> k = j.stream().sorted(Comparator.comparingInt(Employee :: getSalary).reversed())
			.collect(Collectors.toList());
	System.out.println(k);
	
	//System.out.println(j.stream().sorted(o1,o2) -> (int)(o2.get));
	//naturalOrder method -- desending
	//filtered use filter 
	
	}
}
