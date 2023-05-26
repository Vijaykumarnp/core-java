package com.xworkz.app.runner;

import com.xworkz.app.dto.BirthdayDTO;
import com.xworkz.app.repository.BirthdayRepo;
import com.xworkz.app.repository.BirthdayRepoImpl;
import com.xworkz.app.service.BirthdayService;
import com.xworkz.app.service.BirthdayServiceImpl;

public class BirthdayRunner {

	
	public static void main(String[] args) {
		
		BirthdayDTO dto = new BirthdayDTO();
		
	BirthdayRepo repo = new BirthdayRepoImpl() ;
		
    BirthdayService src =  new BirthdayServiceImpl(repo);
    dto.setId(1);
    //src.validateAndSave(dto);
   src.updateDTO(7);
   // src.deleteDto(1);
    
		
		
		
	}
}
