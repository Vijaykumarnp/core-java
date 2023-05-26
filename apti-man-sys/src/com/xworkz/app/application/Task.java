package com.xworkz.app.application;

public class Task {
    int  d[] = {2 , 3 , 5,4 ,4 ,6,7,8};  
   
	public  void evenOrOdd() {
		for (int i = 0; i < d.length; i++) {
			
			if(d[i]%2 == 0) {
				System.out.println("even"+d[i]);
			int sq =  d[i]+2;
			int sq1 = sq*sq;
			System.out.println("square of next even number"+sq1);
			}else if(d[i]%1 == 0){
				int ifd =  d[i]-2;
				int j =  ifd*ifd;
				System.out.println("square of previous odd"+j);
			System.out.println("odd"+d[i]);
			}
			
	}
	}
	
	public  void prime() {
		for (int i = 0; i < d.length; i++) {
			
			int count =0;
		
		
		
for (int j = 1; j < 10; j++) {
				
			
			if(d[i]%j == 0 ) {
				count = count +1;
			}
			}
			//System.out.println(count);
			if(count == 2) {
				int l = d[i]*d[i];
				System.out.println("sq of prime " +l);
				System.out.println("prime number"+d[i]);
			}else {
				System.out.println("not prime " + d[i]);
			}
			}
	}
	
	
	public static void main(String[] args) {
		Task k = new Task();
		
		k.evenOrOdd();
		k.prime();
		
	}
		
	}
	






