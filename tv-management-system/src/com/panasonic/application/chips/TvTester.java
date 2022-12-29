package com.panasonic.application.chips;

import java.util.Iterator;
import java.util.Scanner;

import com.panasonic.application.tv.Tv;

public class TvTester {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = scanner.nextInt();
		Tv tv = new Tv(size);
		for (int i = 0; i < size; i++) {
			
		
			
		
		System.out.println("enter the type of chip");
		String type = scanner.next();
		System.out.println("enter the ic name");
		String name = scanner.next();
		System.out.println("enter the ram of the chip");
		int ram = scanner.nextInt();
		System.out.println("enter the size of chip");
		String size1 = scanner.next();
		Chip chip = new Chip(type , name , ram , size1);
		tv.addChips(chip);
	}
		tv.getChipDetails();
		tv.getChipdetailsByram(276);
		tv.updateIcNameBySize("IC4546", "5mm");
		
	}
}
