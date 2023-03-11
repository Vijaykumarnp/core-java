package com.xworkz.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.dto.TerminalDTO;
import com.xworkz.dto.comparators.NameComparator;

public class AirportImpl implements Airport{

	
	
	List<TerminalDTO> list = new ArrayList<TerminalDTO>();
	
	@Override
	public boolean saveTerminal(TerminalDTO dto) throws Exception {
              boolean isAdded = false;
          if(dto != null  ){
        	  list.add(dto);
          }else {
        	  System.out.println("terminal not added");
          }
		
		return isAdded;
	}

	@Override
	public List getTerminal() throws Exception {
		//Collections.sort(list);
		Collections.sort(list, new NameComparator());
	Iterator<TerminalDTO> itrr = list.iterator();
		while(itrr.hasNext()) {
			System.out.println(  itrr.next());
		}
		return list;
	}
}
