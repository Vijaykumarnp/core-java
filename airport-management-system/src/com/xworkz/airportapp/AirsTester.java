package com.xworkz.airportapp;

import com.xworkz.airportapp.airport.Airport;
import com.xworkz.airportapp.airport.KempeGowdaAirport;
import com.xworkz.airportapp.airport.MahathmaGandiAirport;

class AirsTester{
	
	public static void main(String[] args) {
		Airport air = new KempeGowdaAirport();
		Airport airs = new MahathmaGandiAirport();
		
		KempeGowdaAirport l =  new KempeGowdaAirport();
		
		System.out.println(l.doBusiness());
		String k = new String();
		String kl = "ksaj";
		String l1 = "ksaj";
		StringBuffer j = new StringBuffer("h");
		StringBuilder ks = new StringBuilder("h");
		
		//System.out.println(j.equals(ks));
	
		System.out.println(k.equals(l1));
		
	}
	
	
	
}