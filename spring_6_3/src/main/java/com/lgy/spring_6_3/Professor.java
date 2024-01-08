package com.lgy.spring_6_3;

import java.util.ArrayList;

public class Professor {
	private String name;
	private int age;
	private ArrayList<String> dept;
	
	public Professor(String name) {
	
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getDept() {
		return dept;
	}
	public void setDept(ArrayList<String> dept) {
		this.dept = dept;
	}
	
}
