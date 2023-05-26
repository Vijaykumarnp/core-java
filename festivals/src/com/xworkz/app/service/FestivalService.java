package com.xworkz.app.service;

import com.xworkz.app.dto.FestivalDTO;

public interface FestivalService {

	
	
	abstract boolean update(String festname , int id);
	abstract boolean delete(int id);
	boolean validateAndSave(FestivalDTO dto);
	
	
	
	
}
