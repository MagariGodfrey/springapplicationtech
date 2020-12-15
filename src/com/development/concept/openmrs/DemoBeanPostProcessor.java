package com.development.concept.openmrs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor implements BeanPostProcessor, Ordered {
	
	public Object postProcessorAfterInitialization(Object arg1, String arg2) 
			throws BeansException {
		System.out.println("The first code at " + arg1);
		return arg1;
	}
	
	public Object postProcessorBeforeInitialization(Object arg1, String arg2) throws BeansException {
		System.out.println("Last code at " + arg1);
		return arg1;
	}
	
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
