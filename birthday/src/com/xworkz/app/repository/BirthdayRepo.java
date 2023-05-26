package com.xworkz.app.repository;

import com.xworkz.app.dto.BirthdayDTO;

public interface BirthdayRepo {

	
	
	abstract boolean onSave(BirthdayDTO dto);
	abstract boolean onUpdate(int id);
	abstract boolean onDelete(int id);
	
}
