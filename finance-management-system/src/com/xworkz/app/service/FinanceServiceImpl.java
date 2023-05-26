package com.xworkz.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.app.FinanceDTO;
import com.xworkz.app.repository.FinanceRepository;
@Component
public class FinanceServiceImpl implements FinanceService {
    @Autowired
	FinanceRepository repo;
	
	
	
	@Override
	public FinanceDTO validateAndSave(FinanceDTO dto) {
		
		boolean isIdPresent = false;
		boolean isNamePresdent = false;
		boolean isLoactionPresent = false;
		boolean isFinanceTypePresent = false;
		
		if(dto.getId() >0)
		 isIdPresent = true;
		
		if(dto.getFinanceName() != null && !(dto.getFinanceName().isEmpty()))
		 isNamePresdent = true;
		
		if(dto.getFinanceType() != null && !(dto.getFinanceType().isEmpty()))
		    isFinanceTypePresent = true;
		
		if(dto.getLocation() != null)
		isLoactionPresent = true;
		
		repo.save(dto);
		
		return dto;
	}

}
