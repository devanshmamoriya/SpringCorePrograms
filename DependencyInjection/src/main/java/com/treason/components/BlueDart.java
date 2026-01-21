package com.treason.components;

public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart class is loaded");
	}
	
	public BlueDart()
	{
		System.out.println("BlueDart zero param constructor is called");
	}
	
	@Override
	public String delivery(int id) {
		
		return "Your order is successfully placed with Bluedart, order is" +id;
	}

}
