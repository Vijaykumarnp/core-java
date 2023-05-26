package com.xworkz.app.repository;

import java.util.List;

import com.xworkz.app.dto.AmusemnetParkDTO;
import com.xworkz.app.exception.AmusementParkException;

public interface AmusementParkRepository  {

	
	
	
	AmusemnetParkDTO save(AmusemnetParkDTO dto ) throws AmusementParkException;
	
	
	
	
}
