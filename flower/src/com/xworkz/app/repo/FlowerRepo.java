package com.xworkz.app.repo;

import com.xworkz.app.dto.FlowerDTO;

public interface FlowerRepo {

	abstract boolean onSave(FlowerDTO dto);
	abstract boolean onUpdate(int id);
    abstract boolean onDelete(String season);	
	
	
}
