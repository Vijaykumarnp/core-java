package com.xworkz.app.controler;

import java.lang.module.FindException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.app.FinanceDTO;
import com.xworkz.app.exception.FinanceException;
import com.xworkz.app.service.FinanceService;
@Component
public class FinanceControler {

	@Autowired
	private FinanceService serice;
	
	public FinanceDTO process(FinanceDTO dto) {
		try {
		if(dto != null) {
		FinanceDTO d=	serice.validateAndSave(dto);
		
		return d;
		}
		else {
			System.out.println("dto is null");
		}
		}catch (FinanceException e) {
			e.printStackTrace();
			throw new FinanceException();
		}
		
		return dto;
	}
	
	
	
}
