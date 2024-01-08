package com.lgy.spring_6_3;

import java.util.ArrayList;

public class Animation {
	private String name;
	private int year;
	private ArrayList<String> member;
	
	
	public Animation(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public ArrayList<String> getMember() {
		return member;
	}
	public void setMember(ArrayList<String> member) {
		this.member = member;
	}
	
}
