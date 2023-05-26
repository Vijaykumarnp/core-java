package com.xworkz.vijiapp;

import com.xworkz.vijiapp.Person.Person;
import com.xworkz.vijiapp.adress.Adress;
import com.xworkz.vijiapp.city.City;
import com.xworkz.vijiapp.country.Country;
import com.xworkz.vijiapp.state.State;
import com.xworkz.vijiapp.street.Street;

public class PersonTester {

	public static void main(String[] args) {
		
		Person pr =  new Person();
		pr.setId(1);
		pr.setName("Raju");
		
		
		Adress ss = new Adress();
		pr.setAdress(ss);	
		System.out.println(pr);
		
		
		
		
	}
	
	
}
