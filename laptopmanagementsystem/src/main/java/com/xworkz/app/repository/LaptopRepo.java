package com.xworkz.app.repository;

import java.util.List;

import com.xworkz.app.dto.LaptopDTO;

public interface LaptopRepo {

	LaptopDTO saveLaptop(LaptopDTO dto);
	
	
	List<LaptopDTO> getAllLaptops();


	List<LaptopDTO> deleteById(int id);
	
}
