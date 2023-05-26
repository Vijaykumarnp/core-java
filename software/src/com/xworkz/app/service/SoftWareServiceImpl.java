package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.app.dto.SoftwareDTO;
import com.xworkz.app.repository.SoftwareRepo;

public class SoftWareServiceImpl implements SoftWareService{

	
	
	
	SoftwareRepo repo;
	
	public SoftWareServiceImpl(SoftwareRepo repo) {
		this.repo=repo;
	}
	
	
	@Override
	public boolean validateAndSave(SoftwareDTO dto) {
	System.out.println("inside onSave");
	
	if(dto != null) {
		ValidatorFactory val = Validation.buildDefaultValidatorFactory();
		Validator valid = val.getValidator();
			Set<ConstraintViolation<SoftwareDTO>> violationMessage = valid.validate(dto);
			if(violationMessage.isEmpty()) {
				boolean save = this.repo.onSave(dto);
				System.out.println(save);
			}
	else {
				System.out.println(violationMessage.toString());
			}
	}
			else {
				System.out.println("Dto is null");
			}
	
	
	
		return true;
	}

}
