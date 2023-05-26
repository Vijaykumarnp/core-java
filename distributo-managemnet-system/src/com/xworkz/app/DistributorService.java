package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.xworkz.app.constant.Gender;
import com.xworkz.app.distributor.Distributor;
import com.xworkz.app.distributor.impl.DistributorImpl;
import com.xworkz.app.dto.SalesPersonDTO;

public class DistributorService {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<SalesPersonDTO> list = new ArrayList<SalesPersonDTO>();
		
			Distributor lk = new DistributorImpl();
		
			
			
			for(int i = 0 ; i<3 ; i++) {
			
			SalesPersonDTO dto = new SalesPersonDTO();
		System.out.println("enetr id ");
		dto.setSalesPersonId(sc.nextInt());
		System.out.println("enetr name ");
		dto.setName(sc.next());
		System.out.println("enetr the adrees");
		dto.setAdress(sc.next());
		System.out.println("enter the gender");
	    dto.setGender(Gender.valueOf(sc.next()));
		System.out.println("enter the age");
		dto.setAge(sc.nextInt());
		System.out.println("enter blood group");
		dto.setBloodGroup(sc.next());
		
			try {
				lk.addSalesPerson(dto);
			
				
			}
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			try {
				System.out.println(lk.getAll());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
		}
		
		
		
		
	
	
	
	
	
	
	

