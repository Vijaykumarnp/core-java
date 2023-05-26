package com.xworkz.app.service;

import com.xworkz.app.dto.PizzaDTO;

public interface PizzaService {

	abstract boolean validateAndSave(PizzaDTO dto);
	abstract boolean update(int id);
	abstract boolean delete(String size);
}
