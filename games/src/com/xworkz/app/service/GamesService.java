package com.xworkz.app.service;

import com.xworkz.app.dto.GamesDTO;

public interface GamesService {

	abstract boolean validateAndSave(GamesDTO dto );
	
}
