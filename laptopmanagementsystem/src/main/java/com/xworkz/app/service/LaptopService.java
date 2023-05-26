package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.dto.LaptopDTO;

public interface LaptopService {

	boolean sendMail(String email);
	
	
	 LaptopDTO  validateAndRegisterLaptop(LaptopDTO dto);
	
	List<LaptopDTO> getAllLaptops();
	
	List<LaptopDTO> getLaptopByCompanyName(String companyName);


	LaptopDTO getLaptopById(int id);


	LaptopDTO updateLaptopById(LaptopDTO dto);


	List<LaptopDTO> validateAndDelete(int id);
	
}
