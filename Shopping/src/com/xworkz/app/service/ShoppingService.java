package com.xworkz.app.service;

import com.xworkz.app.dto.ShoppingDTO;

public interface ShoppingService {

	abstract boolean validateAndSave(ShoppingDTO dto);
	abstract boolean readByEmail(String email);
	abstract boolean readByName(String name);
	abstract boolean readAll();
	abstract boolean updateById(String name, int id);
	abstract boolean updateByName(String location,String name);
	abstract boolean updateByEmail(String name , String email);
	abstract boolean deleteById(int id );
	abstract boolean deleteByEmail(String email);
}
