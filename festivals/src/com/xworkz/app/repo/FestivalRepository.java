package com.xworkz.app.repo;

import com.xworkz.app.dto.FestivalDTO;

public interface FestivalRepository {

	abstract boolean onSave(FestivalDTO dto);
	abstract boolean onUpdate(String festName , int id);
	abstract boolean onDelete(int id);
	
	
}
