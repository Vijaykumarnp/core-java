package com.xworkz.application.deliveryapp;

import java.util.List;

import com.xworkz.application.dto.DeliveryBoyDTO;

public interface DelieryApp {


	
   public 	List saveBoys(DeliveryBoyDTO dto) throws Exception;
	
	public  void getAllBoys() throws Exception;
	
}
