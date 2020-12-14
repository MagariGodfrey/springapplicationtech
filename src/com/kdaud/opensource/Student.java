package com.kdaud.opensource;


public class Student {
	
	private Concept concept;
	
	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
	public void callerMethod() {
		concept.prepareTreatment();
	}
	
}
