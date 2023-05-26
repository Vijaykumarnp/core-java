package com.xworkz.app.application;

import java.util.Iterator;

public class Numbers {

	public static void main(String[] args) {
		int evenCount = 0 , oddCount = 0;
		for (int i = 0; i < 100; i++) {
			if(i%2 == 0) {
			evenCount +=1;	
				
			}
			else {
				oddCount +=1;//oddCount = oddCount+1;
			}
		}
		System.out.println("the even number is" + evenCount);
		System.out.println("the odd number is" + oddCount);
			
		}
		
		
		
		
		
	}

	
	
	
	

		
		

