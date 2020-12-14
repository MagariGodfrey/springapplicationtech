/**
 * 
 */
package com.kdaud.opensource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author opensource
 *
 */
public class Test {
	
	/**
	 * @author kdaud
	 * @since 2018
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigurationFile.xml");
		Student student = (Student) context.getBean("usercall");
		student.clearForGraduation();
	}
	
}
