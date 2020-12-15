package com.placeholderconfigure.concept;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvancedCode {
	
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("MySpringConfigurationFile.xml");
		
		Developer developer = (Developer) beanFactory.getBean("springpropertyfile");
		//developer.setCommunityName("OpenMRS was founded in 2004 by Burke Mumlim");
		developer.referencingOpenMRSApi();
		
	}
	
}
