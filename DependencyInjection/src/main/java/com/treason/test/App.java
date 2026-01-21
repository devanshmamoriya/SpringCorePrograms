package com.treason.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.treason.components.Flipkart;

public class App {
	public static void main(String[] args) {

		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		beanDefinitionReader.loadBeanDefinitions("/com/treason/config/ApplicationContext.xml");
		
		System.out.println("CONTAINER IS STARTED\n");
		Flipkart flipkart=(Flipkart) defaultListableBeanFactory.getBean("flipkart",Flipkart.class);
		
		String result = flipkart.doShopping(new String[] {"Audi","Tata Motors"}, new float[] {3452.5f,2344.5f} );
	    System.out.println(result);
		
	    System.out.println("\nCONTAINER IS CLOSED");
	    
	}
}
