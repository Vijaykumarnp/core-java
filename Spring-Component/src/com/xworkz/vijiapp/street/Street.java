package com.xworkz.vijiapp.street;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.vijiapp.Person.Person;
import com.xworkz.vijiapp.adress.Adress;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Street {
  @Value("1")
	private String streetNo;
  @Value("raj")
	private String streetName;
	
}
