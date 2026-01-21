package com.treason.components;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight class is loaded");
	}
	
	public FirstFlight(){
		System.out.println("FirstFlight constructor is called ");
	}

	
	@Override
	public String delivery(int id) {
		
		return "Your order is successfully placed with FirstFlight, order is"+id;
	}

}
