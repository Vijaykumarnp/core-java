package com.xworkz.app.service;

import com.xworkz.app.dto.FlowerDTO;

public interface FlowerService {

	abstract boolean validateAndUpdate(FlowerDTO dto);
	abstract boolean update(int id);
	abstract boolean delete(String season);
	
	
}
