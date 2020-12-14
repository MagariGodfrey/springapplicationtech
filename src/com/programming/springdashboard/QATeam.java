package com.programming.springdashboard;

import java.util.Set;

public class QATeam {
	
	private Set myList;
	
	public void setMyList(Set List) {
		this.myList = List;
	}
	
	public void printQACommiter() {
		System.out.println("QATeam commiters: " + myList);
	}
	
}
