package com.xworkz.bank;

import java.util.List;

import com.xworkz.dto.CustomerDTO;

public interface Bank {

	public void saveCustomer(CustomerDTO dto)  throws Exception;
	public List getCustomer()  throws Exception;
	public List getCustomerByNamae(String name);
	
	
}
