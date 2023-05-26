package com.xworkz.app.distributor.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.app.comparartors.AgeComparator;
import com.xworkz.app.comparartors.NameComporator;
import com.xworkz.app.distributor.Distributor;
import com.xworkz.app.dto.SalesPersonDTO;

public class DistributorImpl implements Distributor {

	
	List<SalesPersonDTO> list = new ArrayList<SalesPersonDTO>();
	
	
	@Override
	public boolean addSalesPerson(SalesPersonDTO dto) throws Exception {
		boolean isAdded = false;
		if(dto != null && !(dto.getName().isEmpty()) ) {
			list.add(dto);
		}else {
			System.out.println("not added");
		}
		
		
		return isAdded;
	}

	@Override
	public List getAll() throws Exception {
	 
	
	    Collections.sort(list, new AgeComparator());
		//Collections.sort(list);
	    Iterator<SalesPersonDTO> lls  =  list.iterator();
	
	    while(lls.hasNext()) {
	     SalesPersonDTO hh =  lls.next();
	        System.out.println(hh);
	    }
	    return list;
	}
}
