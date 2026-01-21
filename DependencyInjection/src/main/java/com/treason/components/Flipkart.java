package com.treason.components;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;
	private Integer discount;
	
	static {
		System.out.println("Flipkart class is loaded");
	}
	
	public Flipkart()
	{
		System.out.println("Flipkart zero param constructor is created");
	}
	
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

	
	//Business Logic
	public String doShopping(String[] items,float[] price)
	{
		System.out.println("Flipkart.doShopping()");
		
		System.out.println("The courier objected is intjected is :"+ courier.getClass().getName());
		
		System.out.println("The discount percentage is : "+discount );
		
		int id=0;
		Random random=new Random();
		id=random.nextInt(100000);
		
		String info=courier.delivery(id);
		
		System.out.println(info);
		
		float val=0f;
		for(float v:price)
			val=val+v;
		
		val=val-((val*discount)/100);
		
		System.out.println("The total cost of purchase of"+Arrays.toString(items) +" is " + val);
		
		return "Thanks for shopping visit again";
	}
	
	
}
