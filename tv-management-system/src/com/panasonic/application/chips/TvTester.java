package com.panasonic.application.chips;

import com.panasonic.application.tv.Tv;

public class TvTester {

	
	public static void main(String[] args) {
		Tv tv = new Tv();
		Chip chip = new Chip("FET" , "IC555" , 245 , "5mm");
		tv.addChips(chip);
	    Chip chip1 = new Chip("JFT" , "IC7700" , 276 , "7nm");
	    tv.addChips(chip1);
		tv.getChipDetails();
		tv.getChipdetailsByram(276);
		tv.updateIcNameBySize("IC4546", "5mm");
		
	}
}
