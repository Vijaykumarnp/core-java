package com.xworkz.application.comparators;

import java.util.Comparator;

import com.xworkz.application.dto.DeliveryBoyDTO;

public class NameComparator  implements Comparator<DeliveryBoyDTO>{

	@Override
	public int compare(DeliveryBoyDTO o1, DeliveryBoyDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
