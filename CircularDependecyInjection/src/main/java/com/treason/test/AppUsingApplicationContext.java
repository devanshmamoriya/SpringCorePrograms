package com.treason.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.treason.components.A;
import com.treason.components.B;


//Example of showing Circular Dependecy don't work with constructor injection
//But Circular Dependency works with setter injection
public class AppUsingApplicationContext {

	public static void main(String[] args) {

//  ApplicationContext-1 for constructor injection
//	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/treason/config/ApplicationContext1.xml");
		
//  ApplicationContext-2 for setter injection
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/treason/config/ApplicationContext2.xml");
		
	System.out.println("Using Application Context");

	A a = context.getBean("a",A.class);
	System.out.println("A object hascode value is :" + a.hashCode());	
	
	B b=context.getBean("b",B.class);
	System.out.println("B object hascode value is :" + b.hashCode());
	
	context.close();	

	}

}
