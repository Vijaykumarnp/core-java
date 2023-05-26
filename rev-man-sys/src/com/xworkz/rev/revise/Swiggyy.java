package com.xworkz.rev.revise;

public class Swiggyy extends DelieryApp {

	
	
	public Swiggyy() {
		super();
	}
	@Override
	public  void delivr() {
		System.out.println("this is child class");
	}
	
	@Override
	public  int delivr(int id) {
		System.out.println("child");
		return super.delivr(id);
	}
	
	
	public static void main(String[] args) {
		Swiggyy h = new Swiggyy();
		System.out.println(h.delivr(10));
		DelieryApp j= new DelieryApp();
		j.delivr(10);
		
	}
	
}
