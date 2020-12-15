package com.beanprocessor.concept;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hospital {
	
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("FileConfiguration.xml");
		
		Patient patient = (Patient) beanFactory.getBean("referalapi");
		patient.greetPatient();
	}
	
}
