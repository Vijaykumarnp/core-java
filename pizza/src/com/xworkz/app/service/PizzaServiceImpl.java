package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.app.dto.PizzaDTO;
import com.xworkz.app.repository.PizzaRepo;

public class PizzaServiceImpl implements PizzaService {

	PizzaRepo repo ;
	
	public PizzaServiceImpl(PizzaRepo repo ) {
		this.repo = repo;
	}
	
	
	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		if(dto != null) {
			ValidatorFactory fac =  javax.validation.Validation.buildDefaultValidatorFactory();
			Validator valid = fac.getValidator();
			Set<ConstraintViolation<PizzaDTO >> set = valid.validate(dto);
			if(set.isEmpty()) {
				boolean save = this.repo.onSave(dto);
				System.out.println(save);
			}else {
				System.out.println(set.toString());
			}
			
		}else {
			System.out.println("dto  is null");
		}
		
		return true;
	}

	@Override
	public boolean update(int id) {
		if(id != 0) {
			boolean up = this.repo.onUpdate(id);
			System.out.println(up);
		}else {
			System.out.println("not updated");
		}
		
		
		return true;
	}

	@Override
	public boolean delete(String size) {
		if(!(size.isEmpty())) {
			boolean si = this.repo.onDelete(size);
			System.out.println(si);
			System.out.println("deleted");
		}else {
			System.out.println("not deleted ");
			
		}
		
		return true;
	}

}
