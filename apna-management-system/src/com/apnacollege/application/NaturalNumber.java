package com.apnacollege.application;



public class NaturalNumber {

	public static void printSum(int i, int j, int k ,  n , sum) {
		if(i == n) {
			summ = i++;
			System.out.println(summ);
			
			return;
			
			
		}
		
		
		
		summ = i++;
		printSum(i+1 , n , sum);
	}
		
	
	
  public static void  main() {
	  printSum(1 , 5 , 0);
	  
  }
	
	
	
}
