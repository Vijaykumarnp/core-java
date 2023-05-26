package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.app.dto.GamesDTO;
import com.xworkz.app.repository.GamesRepository;

public class GamesSericeImpl implements GamesService{

	public GamesSericeImpl() {
		// TODO Auto-generated constructor stub
	}
	
	GamesRepository repo;
	
	public GamesSericeImpl(GamesRepository repo) {
		this.repo = repo;
	}
	
	
	
	@Override
	public boolean validateAndSave(GamesDTO dto) {
	System.out.println("inside the validateAndSave");
	
	if(dto != null) {
	ValidatorFactory fac = Validation.buildDefaultValidatorFactory();
	
	Validator valid = fac.getValidator();
	Set<ConstraintViolation<GamesDTO>> set = valid.validate(dto);
	
	if(set .isEmpty()) 
	{
		boolean save = this.repo.onSave(dto);
		System.out.println(save);
		
		
		
	}else {
		
		System.out.println(set.toString());
	}
}
	else {
		System.out.println("Dto is null");
	}


	
	
	
	
	
		return true;
	}

}
