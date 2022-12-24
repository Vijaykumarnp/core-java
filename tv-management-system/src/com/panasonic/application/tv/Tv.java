package com.panasonic.application.tv;

import com.panasonic.application.chips.Chip;

public class Tv {

	Chip chip[] = new Chip[2];
	int ind;
	
	public Tv() {
		System.out.println("the tv object is created");
	}
	
	public String addChips(Chip chip) {
		System.out.println("the method addChips is created");
		boolean isAdded = false;
		if(chip.icName != null) {
			this.chip[ind++] = chip ;
			isAdded = true ;
		}
		return null;
	}
	
	public String getChipDetails() {
		System.out.println("inside the get chip details method ");
		for(int i=0 ; i<chip.length ; i++) {
			System.out.println(chip[i].icName + " " + chip[i].ram + " " + chip[i].size + " " + chip[i].type);
			
		}
		
	return null ;	
	}
	
	public Chip getChipdetailsByram(int ram) {
		System.out.println("inside the method  getChipdetailsBySize");
		for(int i=0 ; i<chip.length ; i++) {
			if(chip[i].ram == ram) {
				System.out.println("size is matched proceed data");
				System.out.println(chip[i].icName + " " + chip[i].ram + " " + chip[i].size + " " + chip[i].type);
				
			}
		}
		return null;
	}
	
	
	
	
	public String updateIcNameBySize(String newIc , String size) {
		System.out.println("inside the updateIcNameBySize method ");
		for(int i=0 ; i<chip.length ; i++) {
			if(chip[i].size == size) {
				System.out.println("the current name of ic is " +chip[i].icName);
				chip[i].icName = newIc;
				System.out.println("the updated name of ic is " + chip[i].icName);
				
			}
			
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
