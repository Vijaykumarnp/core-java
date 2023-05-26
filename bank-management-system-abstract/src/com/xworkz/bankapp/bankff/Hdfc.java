package com.xworkz.bankapp.bankff;

public class Hdfc extends AxisBank{

	public Hdfc(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	
	boolean lessInvestment = false;
	
	@Override
	public int doBusiness() {
	if(lessInvestment == true) {
		System.out.println("the investment is less");
	}
		
		return super.doBusiness();
	}

}
