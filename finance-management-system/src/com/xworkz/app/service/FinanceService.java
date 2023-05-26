package com.xworkz.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.app.FinanceDTO;
import com.xworkz.app.repository.FinanceRepository;

public interface FinanceService {
    
	
	
	public FinanceDTO validateAndSave(FinanceDTO dto);
	
	
	
}
