package com.xworkz.vijiapp.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.xworkz.vijiapp.Person.Person;
import com.xworkz.vijiapp.adress.Adress;
import com.xworkz.vijiapp.street.Street;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
   @Value("banglore")
	private String city;
	@Autowired
	private Street street;
}
