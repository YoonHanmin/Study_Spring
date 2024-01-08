package com.lgy.spring_5_2;

public class Circle {
	private int radius;
	
	
	public Circle(int radius) {
	
		this.radius = radius;
	}

	public void process(){
		System.out.println("반지름 : "+radius);
		System.out.println("원의 면적은: "+radius*radius*3.14);
	
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
