package com.xworkz.app.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.app.dto.AmusemnetParkDTO;
import com.xworkz.app.exception.AmusementParkException;
import com.xworkz.app.repository.AmusementParkRepository;

@Component
public class AmusementParkServiceImpl implements AmusementParkService{

	@Autowired
	private AmusementParkRepository repo;
	public AmusementParkServiceImpl() {
		System.out.println("giving data from controler to serivce for validate");
	}
	AmusemnetParkDTO d = new AmusemnetParkDTO();
	@Override
	public AmusemnetParkDTO validateAndSave(AmusemnetParkDTO dto) throws AmusementParkException {
		System.out.println("validating the data");
		boolean isIdPresent = false;
		boolean isNamePresent = false;
		boolean isAreaOccupied = false;
		boolean isAdress = false;
		boolean isEntryFee = false;
		
		if(dto.getAmusementParkId() > 0) 
			isIdPresent = true;
		
		if(dto.getAmusementParkAdress() != null && !(dto.getAmusementParkAdress().isEmpty())) 
		
		      
		      isAdress = true;
		
		      if(dto.getAreaOccupied() != null && (dto.getAreaOccupied().isEmpty()))
		      isAreaOccupied = true;
		      
		      if(dto.getEntryFee() != 0.0)
		        isEntryFee = true;
		      
	repo.save(dto);
		
		
		
		return dto;
	}

}
