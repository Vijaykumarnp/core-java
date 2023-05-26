package com.xworkz.app.repository;

import com.xworkz.app.dto.SoftwareDTO;

public interface SoftwareRepo {

	
	abstract boolean onSave(SoftwareDTO dto);
	
	
	
}
