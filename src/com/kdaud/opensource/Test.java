/**
 * 
 */
package com.kdaud.opensource;

import java.util.ArrayList;
import java.util.List;

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
		//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigurationFile.xml");
		//		Student student = (Student) context.getBean("systemcall");
		//      student.callerMethod();
		listCaller();
		//System.out.println("");
	}
	public static void listCaller() {
		List<Integer> commiter = new ArrayList<>();
		commiter.add(0, 84);
		commiter.add(1, 85);
		commiter.add(2, 90);
		commiter.add(3, 88);
		//System.out.println(commiter);
		
		//		for (String string : commiter) {
		//			System.out.println("Value: " + string);
		//		}
		
		commiter.forEach(K -> System.out.println(K));
	}
	
}
