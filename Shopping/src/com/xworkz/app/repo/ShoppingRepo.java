package com.xworkz.app.repo;

import com.xworkz.app.dto.ShoppingDTO;

public interface ShoppingRepo {

	abstract boolean onSave(ShoppingDTO dto);
	abstract boolean onReadByEmail(String email);
	abstract boolean onReadByName(String name);
	abstract boolean readAll();
	abstract boolean onUpdateById(String name, int id);
	abstract boolean onUpdateByName(String location,String name);
	abstract boolean onUpdateByEmail(String name , String email);
	abstract boolean onDeleteById(int id );
	abstract boolean onDeleteByEmail(String email);
	
}
