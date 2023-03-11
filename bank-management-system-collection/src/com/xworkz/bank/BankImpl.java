package com.xworkz.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.dto.CustomerDTO;

public class BankImpl  implements Bank {

	
	  List<CustomerDTO> lis = new ArrayList<CustomerDTO>();
	@Override
	public void saveCustomer(CustomerDTO dto) throws Exception {
		if(dto != null && !(dto.getCusName().isEmpty())) {
			
			lis.add(dto);
		}
	}

	@Override
	public List  getCustomer() throws Exception {
	Collections.sort(lis);
		Iterator<CustomerDTO> itr = lis.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		return lis;
	}
	
}