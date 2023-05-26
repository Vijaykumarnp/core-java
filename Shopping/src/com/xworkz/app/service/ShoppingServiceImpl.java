package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.xworkz.app.dto.ShoppingDTO;
import com.xworkz.app.repo.ShoppingRepo;

public class ShoppingServiceImpl implements ShoppingService {

	ShoppingRepo repo;
	
	public ShoppingServiceImpl(ShoppingRepo repo) {
		this.repo=repo;
	}
	
	
	
	
	@Override
	public boolean validateAndSave(ShoppingDTO dto) {
		if(dto != null) {
			ValidatorFactory fac = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator	 valid =  fac.getValidator();
		Set<ConstraintViolation<ShoppingDTO>> i = valid.validate(dto);
		if(i.isEmpty()) {
			boolean save = this.repo.onSave(dto);
		}else {
			System.out.println("not saved ");
		}
		
		}else {
			System.out.println("DTO is null");
		}
		
		
		
		return false;
	}

	@Override
	public boolean readByEmail(String email) {
		if(!(email.isEmpty())) {
			boolean read = this.repo.onReadByEmail(email);
		}else {
			System.out.println("not found");
		}
		
		
		
		return true;
	}

	@Override
	public boolean readByName(String name) {
		if(!(name.isEmpty())) {
			boolean st = this.repo.onReadByName(name);
		}else {
			System.out.println("not found");
		}
		return true;
	}

	@Override
	public boolean readAll() {
		this.repo.readAll();
		return true;
	}

	@Override
	public boolean updateById(String name, int id) {
	          if(id !=0) {
	        	boolean save = this.repo.onUpdateById(name, id);
	          }else {
	        	  System.out.println("not matched");
	          }
		return true;
	}

	@Override
	public boolean updateByName(String location, String name) {
		if(name.isEmpty()) {
			this.repo.onUpdateByName(location, name);
			
		}else {
			System.out.println("not matched");
		}
		
		
		
		return true;
	}

	@Override
	public boolean updateByEmail(String name, String email) {
		if(!(email.isEmpty())) {
			this.repo.onUpdateByEmail(name, email);
		}else {
			System.out.println("not updated");
		}
		
		
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(id != 0) {
			boolean save = this.repo.onDeleteById(id);
		}else {
			System.out.println("not matched");
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		if(!(email.isEmpty())) {
			boolean save = this.repo.onDeleteByEmail(email);
		}else {
			System.out.println("not found");
		}
		return true;
	}

}
