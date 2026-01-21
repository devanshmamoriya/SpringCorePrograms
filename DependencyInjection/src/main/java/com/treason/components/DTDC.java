package com.treason.components;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC class is loaded");
	}
	
	public DTDC(){
		System.out.println("DTDC constructor is called ");
	}
	
	@Override
	public String delivery(int id) {
	
		return "Your order is successfully placed with DTDC, order is;" +id;
	}

}
