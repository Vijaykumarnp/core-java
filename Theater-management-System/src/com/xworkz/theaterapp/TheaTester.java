package com.xworkz.theaterapp;

import com.xworkz.theaterapp.screen.Screen;
import com.xworkz.theaterapp.theater.Narthaki;
import com.xworkz.theaterapp.theater.Navrang;
import com.xworkz.theaterapp.theater.Theater;

public class TheaTester {

	
	public static void main(String[] args) {
		Theater theaa = new Navrang();
		Theater thea = new Narthaki();
		Screen screen = new Screen();
		
		theaa.addScreen(screen);
		
		Navrang nav = (Navrang)theaa;
		nav.seat();
		
		
	}
}
