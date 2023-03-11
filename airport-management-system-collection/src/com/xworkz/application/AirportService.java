package com.xworkz.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.xworkz.airport.AirportImpl;
import com.xworkz.dto.TerminalDTO;

public class AirportService {

	
	
	public static void main(String[] args)  {
		AirportImpl ll = new AirportImpl();
		
		List<TerminalDTO> ls = new ArrayList<TerminalDTO>();
		Scanner sc =  new Scanner(System.in);
		System.out.println("enetr size");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			TerminalDTO dtos =new TerminalDTO();
			System.out.println("eneter termiunal name");
	          dtos.setName(sc.next());
			System.out.println("enter size of the terminal");
		    dtos.setSize(sc.nextInt());
			System.out.println("enter the type of the terminal");
		     dtos.setType(sc.next());
		     System.out.println("enter the location ");
		     dtos.setlocation(sc.next());
		     System.out.println("enter the id");
		     dtos.setId(sc.nextInt());
		     try {
				ll.saveTerminal(dtos);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		}
		
        try {
			System.out.println(ll.getTerminal());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	 
        
        
	}
	
	
	
	
}
