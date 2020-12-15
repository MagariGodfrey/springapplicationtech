package com.development.concept.openmrs;

public class Programmer {
	
	public void commitedIteration() {
		System.out.println("He has commited code to Openmrs code base");
	}
	

	public void init() {
		System.out.println("Just Before Initialization");
		
	}
	

	public void destroy() {
		System.out.println("Before closing the bean");
		
	}
	
	//	@PostConstruct
	//	public void init() {
	//		System.out.println("Before Instatianting the bean object");
	//	}
	//	
	//	@PreDestroy
	//	public void destroy() {
	//		System.out.println("Just before destroying the bean");
	//	}
	
}
