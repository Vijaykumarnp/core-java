package com.xworkz.application;

public class FindEven {

	public static void main(String[] args) {
		
		int a[] = {1 ,2, 3, 45,55};
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				odd = a[i] + 1;
			}
		}
		System.out.println(odd);
		
	}
	
	
}
