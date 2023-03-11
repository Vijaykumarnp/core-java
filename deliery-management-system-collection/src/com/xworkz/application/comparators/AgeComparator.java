package com.xworkz.application.comparators;

import java.util.Comparator;

import com.xworkz.application.dto.DeliveryBoyDTO;

public class AgeComparator implements Comparator<DeliveryBoyDTO> {

	@Override
	public int compare(DeliveryBoyDTO o1, DeliveryBoyDTO o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

}
