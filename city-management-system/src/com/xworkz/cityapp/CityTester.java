package com.xworkz.cityapp;



import com.xworkz.cityapp.area.Area;

import java.util.Scanner;

import com.xworkz.cityapp.city.City;

public class CityTester {

	
	public static void main(String a[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int sizee = scanner.nextInt();
		
		City city = new City(sizee);
		for (int i = 0; i < sizee; i++) {
			
		System.out.println("enter the name");
			String name = scanner.next();
		System.out.println("enter the population");
		    String pop = scanner.next();
		System.out.println("enter size");
		int size = scanner.nextInt();
	         Area area = new Area(name , pop , size);
		
		city.addArea(area);
		}
		city.getAreaDetails();
		
	}
	
	
}
