package com.xworkz.vijiapp.adress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.xworkz.vijiapp.Person.Person;
import com.xworkz.vijiapp.country.Country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adress {
    @Value("India")
	private String county;
	@Autowired
	private Country country;
	
}
