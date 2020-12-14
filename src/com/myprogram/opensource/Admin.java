package com.myprogram.opensource;

import java.util.Map;

public class Admin {
	
	private Map<Character, String> openmrsAdmin;
	
	public void setOpenmrsAdmin(Map<Character, String> openmrsAdmin) {
		this.openmrsAdmin = openmrsAdmin;
	}
	
	public void printAdmin() {
		System.out.println("Metadata of Admins: " + openmrsAdmin);
	}
	
}
