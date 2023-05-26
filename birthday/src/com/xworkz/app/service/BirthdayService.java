package com.xworkz.app.service;

import com.xworkz.app.dto.BirthdayDTO;

public interface BirthdayService {

	
	abstract boolean validateAndSave(BirthdayDTO dto);
	abstract boolean updateDTO(int id );
	abstract boolean deleteDto(int id);
	
	
	
}
