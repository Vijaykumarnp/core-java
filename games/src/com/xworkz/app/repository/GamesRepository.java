package com.xworkz.app.repository;

import com.xworkz.app.dto.GamesDTO;

public interface GamesRepository {

	abstract boolean onSave(GamesDTO dto);
	
	
}
