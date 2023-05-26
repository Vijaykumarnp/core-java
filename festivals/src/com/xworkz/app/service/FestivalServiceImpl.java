package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.app.dto.FestivalDTO;
import com.xworkz.app.repo.FestivalRepository;

public class FestivalServiceImpl implements FestivalService{

	FestivalRepository repo;
	
	public FestivalServiceImpl(FestivalRepository repo) {
		this.repo = repo;
		
	}

	@Override
	public boolean validateAndSave(FestivalDTO dto) {

		if(dto != null) {
			ValidatorFactory fac = Validation.buildDefaultValidatorFactory();
			Validator h = fac.getValidator();
			Set<ConstraintViolation<FestivalDTO>> mes = h.validate(dto);
			
			if(mes.isEmpty()) {
				boolean save =  this.repo.onSave(dto);
				System.out.println(save);
				
			}else {
				System.out.println(mes.toString());
			}
		}else {
			System.out.println("dto is null");
		}
		
		
		return true;
	}

	@Override
	public boolean update(String festname , int id) {
		if(!(festname.isEmpty())) {
			boolean save = this.repo.onUpdate(festname , id);
			System.out.println("updated");
		}else {
			System.out.println("not updated");
		}
		
		
		return true;
	}

	@Override
	public boolean delete(int id) {
	
		if(id != 0) {
			boolean save = this.repo.onDelete(id);
			System.out.println(save);
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
		
		return true;
	}
}
