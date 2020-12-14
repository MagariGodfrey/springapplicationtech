package com.kdaud.opensource;


public class Commiter implements Concept {
	
	static {
		System.out.println("OpenMRS Concept Lab");
	}
	
	@Override
	public void prepareTreatment() {
		System.out.println("Dear implementers! We are about to deliver the next release in two weeks time");
		
	}
	
}
