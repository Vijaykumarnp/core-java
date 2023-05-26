package com.xworkz.app.repository;

import com.xworkz.app.dto.NinjaDTO;

public interface NinjaRepo {

	public boolean onSave(NinjaDTO dto);
	public boolean onUpdate(String platForm , int id);
	public boolean onRead();
	public boolean onDelete();
	
	
	
}
