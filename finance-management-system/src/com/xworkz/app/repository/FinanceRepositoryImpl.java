package com.xworkz.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.app.FinanceDTO;
@Component
public class FinanceRepositoryImpl implements FinanceRepository {

	@Autowired
	public List<FinanceDTO> lis;
	
	
	
	@Override
	public FinanceDTO save(FinanceDTO dto) {
		
		//FinanceDTO dtos = new FinanceDTO();
		boolean isAdded = false;
		if(dto != null) {
			isAdded = true;
			
		}
				
		
		return dto;
	}

}
