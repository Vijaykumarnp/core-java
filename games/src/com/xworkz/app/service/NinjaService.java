package com.xworkz.app.service;

import com.xworkz.app.dto.NinjaDTO;

public interface NinjaService {

	
	public boolean validateAndSave(NinjaDTO dto);
	public boolean upadate(String platForm , int id);
	public boolean read();
	
	
}
