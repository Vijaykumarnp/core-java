package com.xworkz.vijiapp.country;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.vijiapp.Person.Person;
import com.xworkz.vijiapp.adress.Adress;
import com.xworkz.vijiapp.state.State;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
	
	
@Autowired
	private State state;
}
