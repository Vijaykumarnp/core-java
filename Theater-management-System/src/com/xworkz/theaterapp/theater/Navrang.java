package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.screen.Screen;

public class Navrang extends Theater {

	public  Navrang() {
		
	}
	
		int sizeee = 100;
		
		@Override
		public String  addScreen(Screen screen){
			if (sizeee == 100) {
				System.out.println("overriding");
			return super.addScreen(screen);
			}
			return null;
			
		}
		
		
		public void seat() {
			System.out.println("340 capacity");
			
		}
	
}
