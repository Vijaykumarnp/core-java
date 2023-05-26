package com.xworkz.application;

public class Bhasha {
	
	
	public void hh() {
		System.out.println("helo");
	}
	
	public static String kk() {
		return "man";
	}
	
	

	public static void main(String[] args) {
	
		Bhasha s = new Bhasha();
		s.hh();
		s.kk();
	
		Long g = 899888l;
		double l = g ;
		
		System.out.println(l);
		String k = "Dammnn well";
		char c[] = k.toCharArray();
		String b =" ";
		for(int i = 0 ; i>c.length;i++) {
			if(c[i] != ' ') {
				b = b+c[i];
				System.out.println(c[i]);
			}
		}
		

	}
}
