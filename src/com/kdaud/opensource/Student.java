package com.kdaud.opensource;


public class Student {
	
	private String welcomeCommiter;
	
	public void setWelcomeCommiter(String welcomeCommiter) {
		this.welcomeCommiter = welcomeCommiter;
	}
	
	static {
		System.out.println("Spring FrameWork Application Module");
	}
	
	public void clearForGraduation() {
	
		System.out.println(welcomeCommiter);
		
	}
	
}
