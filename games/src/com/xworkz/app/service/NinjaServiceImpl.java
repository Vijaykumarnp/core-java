package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.app.dto.NinjaDTO;
import com.xworkz.app.repository.NinjaRepo;

public class NinjaServiceImpl implements NinjaService {

	NinjaRepo repo;
	
	public NinjaServiceImpl(NinjaRepo repo) {
		this.repo = repo;
	}
	
	
	
	@Override
	public boolean validateAndSave(NinjaDTO dto) {
	  
		if(dto != null) {
		ValidatorFactory fac = Validation.buildDefaultValidatorFactory();
		    javax.validation.Validator vali =   fac.getValidator();
		  Set<ConstraintViolation<NinjaDTO>> d = vali.validate(dto);
		
		  
		  if(d.isEmpty()) {
			  boolean save = this.repo.onSave(dto);
		  }else {
			  System.out.println("null");
		  }
		}else {
			System.out.println("");
		}
		  
		return true;
	}

	@Override
	public boolean upadate(String platForm, int id) {
		
		
		return true;
	}

	@Override
	public boolean read() {
		// TODO Auto-generated method stub
		return false;
	}

}
