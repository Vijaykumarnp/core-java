package com.xworkz.vijiapp.Person;

import com.xworkz.vijiapp.adress.Adress;
import com.xworkz.vijiapp.country.Country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	
	private int id;
	private String name;
	private Adress adress;
}
