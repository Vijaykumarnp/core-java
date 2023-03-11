package com.xworkz.application.deliveryapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.application.comparators.VehicleComparator;
import com.xworkz.application.dto.DeliveryBoyDTO;

public class DeliveryImpl implements DelieryApp{
      List<DeliveryBoyDTO> list = new ArrayList<DeliveryBoyDTO>();

	@Override
	public List saveBoys(DeliveryBoyDTO dto) throws Exception {
		if(dto != null &&   !(dto.getName().isEmpty())) {
			list.add(dto);
		}
		
		
		return list;
	}

	@Override
	public void getAllBoys() throws Exception {
		
		//Collections.sort(list);
		Collections.sort(list, new VehicleComparator());
		Iterator<DeliveryBoyDTO> itr =  list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
