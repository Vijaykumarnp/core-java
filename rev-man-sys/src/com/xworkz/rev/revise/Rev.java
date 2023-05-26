package com.xworkz.rev.revise;

public class Rev {

	public  static int add(int a , int b) throws NumberNotFoundException {
		
		
		
		if(b == 0) {
		
			throw new NumberNotFoundException();
		}else {
			
		}
		return a/b;
	}
	
	public static void main(String[] args) throws NullPointerException  {
		Rev r = new Rev();
		
		try {
			System.out.println(r.add(2 ,0));
		}finally {
			
		}
			
		}
	}
	
	
	
	
}
