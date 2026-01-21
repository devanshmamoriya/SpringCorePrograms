package com.treason.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.treason.components.Flipkart;

public class AppUsingApplicationContext {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/treason/config/ApplicationContext.xml");
		
		
		System.out.println("CONTAINER IS STARTED\n");
		Flipkart flipkart=(Flipkart) context.getBean("flipkart",Flipkart.class);
		
		String result = flipkart.doShopping(new String[] {"Audi","Tata Motors"}, new float[] {3452.5f,2344.5f} );
	    System.out.println(result);
		
	    System.out.println("\nCONTAINER IS CLOSED");
	    

	}

}
