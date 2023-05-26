package com.xworkz.app;

public class AirthTester{

	
	public static void main(String[] args) {
		
		Add ar =  (a , b) -> {System.out.println(a+b);
		System.out.println("addition");
		};
		ar.add(2, 4);
	
		
		Sub af = ( a ,  b) -> 
		{
			System.out.println(a-b);  
		System.out.println("subtracting the 2 values");
		
        System.out.println("susbstraction");
		};
		af.sub(8, 2);
		
		
		Mul m = (a ,b) -> {System.out.println(a*b);
		System.out.println("multiplication");
		};
		m.mul(2, 3);
		
		Sub s = (a , b) ->{ System.out.println(a/b);
		System.out.println("division");
		};
		s.sub(4, 2);
	}
	
	
}
