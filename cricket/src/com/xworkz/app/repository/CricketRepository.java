package com.xworkz.app.repository;

import com.xworkz.app.cricketdto.CricketDTO;

public interface CricketRepository {

	abstract boolean onSave(CricketDTO dto);
	
}
