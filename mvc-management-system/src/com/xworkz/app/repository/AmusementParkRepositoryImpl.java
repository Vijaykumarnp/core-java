package com.xworkz.app.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.app.dto.AmusemnetParkDTO;
import com.xworkz.app.exception.AmusementParkException;

@Component
public class AmusementParkRepositoryImpl implements AmusementParkRepository{

	List<AmusemnetParkDTO> lis;
	public AmusementParkRepositoryImpl() {
		System.out.println("inside reporitory");
	}
	
	@Override
	public AmusemnetParkDTO save(AmusemnetParkDTO dto) throws AmusementParkException {
		
		System.out.println(" saving data ");
		AmusemnetParkDTO dtos = new AmusemnetParkDTO();
		
		boolean isAdded = false;
		
		if(dto != null) {
			isAdded = true;
		}
		if(isAdded) {
			dtos = dto;
		}
		
		return dtos;
	}

}
