package com.beanprocessor.concept;


public class Patient {
	
	private String welcomeMsg;
	
	private String patientName;
	
	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public void greetPatient() {
		System.out.println(welcomeMsg);
	}
}
