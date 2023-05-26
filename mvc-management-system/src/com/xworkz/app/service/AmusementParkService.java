package com.xworkz.app.service;

import com.xworkz.app.dto.AmusemnetParkDTO;
import com.xworkz.app.exception.AmusementParkException;

public interface AmusementParkService {

	
         AmusemnetParkDTO     validateAndSave(AmusemnetParkDTO dto) throws AmusementParkException;
	
	
}
