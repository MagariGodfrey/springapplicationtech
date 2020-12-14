package com.myprogram.opensource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Developer {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringFile.xml");
		Admin admin=(Admin)context.getBean("calling");
		admin.printAdmin();
		
	}
	
}
