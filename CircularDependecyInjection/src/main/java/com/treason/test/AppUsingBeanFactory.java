package com.treason.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.treason.components.A;
import com.treason.components.B;


//Example of showing Circular Dependecy don't work with constructor injection
//But Circular Dependency works with setter injection
public class AppUsingBeanFactory 
{
    public static void main( String[] args )
    {
		
		  DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		  XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		  
		  //ApplicationContext-1 for constructor injection (using constructor tag)
		  //reader.loadBeanDefinitions("/com/treason/config/ApplicationContext1.xml");
		  
		  //ApplicationContext-2 for setter injection (using property tag)
		  reader.loadBeanDefinitions("/com/treason/config/ApplicationContext2.xml");

		  
		  System.out.println("Using Bean Factory");
		  
		  A a = factory.getBean("a",A.class);
		  System.out.println("A object hascode value is :" + a.hashCode());
		  
		  B b=factory.getBean("b",B.class);
		  System.out.println("B object hascode value is :" + b.hashCode());

    }
}
