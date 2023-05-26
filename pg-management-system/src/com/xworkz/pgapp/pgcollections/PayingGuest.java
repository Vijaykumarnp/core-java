package com.xworkz.pgapp.pgcollections;

import java.util.List;

import com.xworkz.pgapp.guest.Guest;

public interface PayingGuest {

	public void saveGuest(Guest gue) throws Exception;
	public List getGuests() throws Exception;
	
	
	
}
