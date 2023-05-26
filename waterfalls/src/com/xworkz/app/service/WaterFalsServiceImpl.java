package com.xworkz.app.service;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.app.dto.WaterFallsDTO;
import com.xworkz.app.repository.WaterFalsRepo;
import com.xworkz.app.repository.WaterFalsRepoImpl;

public class WaterFalsServiceImpl implements WaterFalsService {
    
	WaterFalsRepo repo ;
	
	public WaterFalsServiceImpl(WaterFalsRepo repo) {
		this.repo = repo;
	}
	
	
	@Override
	public boolean validateAndSave(WaterFallsDTO dto) {
		System.out.println("validateAndSave");
		if(dto != null) {
	ValidatorFactory factory	=	Validation.buildDe
			
		}
		
		
		
		
		
		
		
		return true;
	}

}
