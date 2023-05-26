package com.xworkz.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.xworkz.airport.AirportImpl;
import com.xworkz.dto.TerminalDTO;

public class AirportService {

	
	
	public static void main(String[] args)  {
		AirportImpl ll = new AirportImpl();
		
		List<TerminalDTO> ls = new ArrayList<TerminalDTO>();
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enetr size");
		  try {
		int size = Integer.parseInt(reader.readLine());
		for (int i = 0; i < size; i++) {
			  
			TerminalDTO dtos =new TerminalDTO();
			System.out.println("eneter termiunal name");
	          dtos.setName(reader.readLine());
			System.out.println("enter size of the terminal");
		    dtos.setSize(Integer.parseInt(reader.readLine()));
			System.out.println("enter the type of the terminal");
		     dtos.setType(reader.readLine());
		     System.out.println("enter the location ");
		     dtos.setlocation(reader.readLine());
		     System.out.println("enter the id");
		     dtos.setId(Integer.parseInt(reader.readLine()));
		
				ll.saveTerminal(dtos);
		}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		
		
        try {
			System.out.println(ll.getTerminal());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	 
        
        
	}
	
	
	
	
}
