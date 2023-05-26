package com.xworkz.app.application;

import java.util.Scanner;

public class Npr {

	public void print(int n , int r) {
		Scanner sc = new Scanner(System.in);
		int nw = sc.nextInt();
		int f = 1;
		int count = 0 ;
		for (int i = 0; i <= nw; i++) {
			f = f*i;
		
		}
		System.out.println(f);
		
		int a  = f - r;
		
		
		
	}
	public static void main(String[] args) {
		//npr = n!(n - r)!
	}
}
