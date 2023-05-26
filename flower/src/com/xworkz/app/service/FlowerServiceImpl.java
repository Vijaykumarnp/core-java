package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.app.dto.FlowerDTO;
import com.xworkz.app.repo.FlowerRepo;

public class FlowerServiceImpl implements FlowerService {
	
	FlowerRepo repo ;
	public FlowerServiceImpl(FlowerRepo repo) {
	this.repo = repo;
	}
	

	@Override
	public boolean validateAndUpdate(FlowerDTO dto) {
		if(dto != null) {
		ValidatorFactory fac = Validation.buildDefaultValidatorFactory();
		Validator val = fac.getValidator();
		Set<ConstraintViolation<FlowerDTO>> f = val.validate(dto);
		if(f.isEmpty()) {
			boolean save = this.repo.onSave(dto);
			System.out.println(save);
		}else {
			System.out.println(f.toString());
		}
		
		
		}else {
			System.out.println("dto is null");
		}
		
		
		return true;
	}

	@Override
	public boolean update(int id) {
		if(id !=0 ) {
			boolean up = this.repo.onUpdate(id);
			System.out.println(up);
			System.out.println("updated");
		}else {
			System.out.println("not updated");
		}
		
		
		return true;
	}

	@Override
	public boolean delete(String season) {
		if(!(season.isEmpty())) {
			boolean up = this.repo.onDelete(season);
			System.out.println(up);
			System.out.println("delted");
		}else {
			System.out.println("not deletdd");
		}
		
		return false;
	}

}
