package com.xworkz.app.distributor;

import java.util.List;


import com.xworkz.app.dto.SalesPersonDTO;

public interface Distributor {

	
	
	public boolean addSalesPerson(SalesPersonDTO dto)  throws Exception;
	public List<SalesPersonDTO> getAll() throws Exception;
	
	
	
}
