package com.development.concept.openmrs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dev5 {
	
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ConfigurationFile.xml");
		
		((AbstractApplicationContext) beanFactory).registerShutdownHook();
		
		Programmer programmer = (Programmer) beanFactory.getBean("mergingcode");
		programmer.commitedIteration();
	}
	
}
