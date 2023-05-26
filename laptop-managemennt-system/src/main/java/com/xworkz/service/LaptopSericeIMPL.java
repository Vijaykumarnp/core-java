package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.xworkzapp.dto.LaptopDTO;
@Service
public class LaptopSericeIMPL implements LaptopService {

	
	 @Autowired
     LaptopRepository laptopRepo ; 
	
	
	
	@Override
	public LaptopDTO validateAndRegisterLaptop(LaptopDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
