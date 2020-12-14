package com.programming.springdashboard;

import java.util.List;
import java.util.Set;

public class Coder {
	
	private List<Integer> listOfCommiter;
	
	private Set<Character> myConcept;
	
	public void setListOfCommiter(List<Integer> listOfCommiter) {
		this.listOfCommiter = listOfCommiter;
	}
	
	public void setMyConcept(Set<Character> concept) {
		this.myConcept = concept;
	}
	public void callingCommiter() {
		//System.out.println("List of Coders: " + listOfCommiter);
		System.out.println("************************");
		System.out.println("Concept Value: " + myConcept);
	}
	

}
