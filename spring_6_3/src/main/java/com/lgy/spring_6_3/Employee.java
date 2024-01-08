package com.lgy.spring_6_3;

import java.util.ArrayList;

public class Employee {
	private String name;
	private int pay;
	private ArrayList<String> certification;
	
	
	public ArrayList<String> getCertification() {
		return certification;
	}
	public void setCertification(ArrayList<String> certification) {
		this.certification = certification;
	}
	public Employee(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
