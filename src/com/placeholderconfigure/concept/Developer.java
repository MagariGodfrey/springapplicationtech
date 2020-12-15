package com.placeholderconfigure.concept;


public class Developer {
	
	private String communityName;
	
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	
	public void referencingOpenMRSApi() {
		System.out.println(communityName);
	}
	
}
