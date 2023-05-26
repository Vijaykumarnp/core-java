package com.xworkz.app.repository;

import com.xworkz.app.dto.PizzaDTO;

public interface PizzaRepo {

	abstract boolean onSave(PizzaDTO dto);
	abstract boolean onUpdate(int id);
	abstract boolean  onDelete(String size );
	
	
}
