package com.beanprocessor.concept;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanImplementerClass implements BeanFactoryPostProcessor {
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configure) throws BeansException {
		BeanDefinition beanDefinition = configure.getBeanDefinition("referalapi");
		MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
		mutablePropertyValues.addPropertyValue("welcomeMsg",
		    "Welcome to OpenMRS Community where Medical System is implemented");
		
	}
	
}
