package com.naturalscience.engineering;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal {
	
	public static void main(String[] args) {
		BeanFactory context = new ClassPathXmlApplicationContext("SpringFile.xml");
		
		Cow cow1 = (Cow) context.getBean("referenceapi");
		cow1.setWelcomeNote("Object1 is seting value for a bean class");
		cow1.conceptPrinter();
		
		Cow cow2 = (Cow) context.getBean("referenceapi");
		//cow2.setWelcomeNote("Object2 referencing spring api");
		cow2.conceptPrinter();
		
	}
	
}
