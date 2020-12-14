/**
 * 
 */
package com.programming.springdashboard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author opensource
 *
 */
public class TestClass {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Coder coder = (Coder) context.getBean("securityapi");
		coder.callingCommiter();
		
		QATeam commiter = (QATeam) context.getBean("mymetadata");
		commiter.printQACommiter();
		
		Coder commit = (Coder) context.getBean("secureconcept");
		commit.callingCommiter();
		
	}
	
}
