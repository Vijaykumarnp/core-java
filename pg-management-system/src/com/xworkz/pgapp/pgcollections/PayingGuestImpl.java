package com.xworkz.pgapp.pgcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.pgapp.guest.Guest;

public class PayingGuestImpl implements PayingGuest{

	List<Guest> list = new ArrayList<Guest>();

	@Override
	public List getGuests() throws Exception {
		
		Collections.sort(list);
	  Iterator<Guest> itr = list.iterator();
	  
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
		
		
		
		return null;
	}

	@Override
	public void saveGuest(Guest gue) throws Exception {
		if(gue != null) {
			list.add(gue);
		}else {
			System.out.println("not added");
		}
		
	}

}
