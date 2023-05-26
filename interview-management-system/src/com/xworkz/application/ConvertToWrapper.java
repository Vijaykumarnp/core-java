package com.xworkz.application;

public class ConvertToWrapper {

	public   void jj() {
		System.out.println("kk");
	}
	public static void main(String[] args) {
		
		int j = 88;
		Integer jk  = j;
		int jd = jk.intValue();
		System.out.println(jd);
		System.out.println(jk);
		
		ConvertToWrapper kk = new ConvertToWrapper();
		
	}
}