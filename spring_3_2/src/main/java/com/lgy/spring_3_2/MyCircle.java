package com.lgy.spring_3_2;

public class MyCircle {
	
	private Circle circle;
	private int radius;
	
	public int getRadious() {
		return radius;
	}

	public void ar() {
		circle.area(radius);
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
}
