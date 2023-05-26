package com.xworkz.app.service;

import javax.validation.ValidatorFactory;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.app.dto.BirthdayDTO;
import com.xworkz.app.repository.BirthdayRepo;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

public class BirthdayServiceImpl implements BirthdayService {

	BirthdayRepo repo;
	
	public BirthdayServiceImpl(BirthdayRepo  repo) {
		this.repo = repo;
		
	}
	
	
	
	
	@Override
	public boolean validateAndSave(BirthdayDTO dto) {
		
		if(dto != null) {
			
			ValidatorFactory fac =  javax.validation.Validation.buildDefaultValidatorFactory();
			Validator valid =  fac.getValidator();
			Set<ConstraintViolation<BirthdayDTO>>  j =  valid.validate(dto);
			
			if(!(j .isEmpty())) {
				boolean save = this.repo.onSave(dto);
				System.out.println(save);
			}
			else {
				System.out.println(j.toString());
			}
			
			
		}else {
			System.out.println("dto is null");
		}
		
		return true;
	}




	@Override
	public boolean updateDTO(int id) {
		
		
		if(id != 0) {
			System.out.println("u can update the data");
			boolean update = this.repo.onUpdate(id);
			System.out.println("update");
		}else {
			System.out.println("you cant update data");
		}
		return true;
	}
	@Override
	public boolean deleteDto(int id) {
		if(id!=0) {
			System.out.println("u can update the data");
			boolean update = this.repo.onDelete(id);
			System.out.println("deleted");
		}else {
			System.out.println("you cant delete data");
		}
	
		return true;
	}
}
