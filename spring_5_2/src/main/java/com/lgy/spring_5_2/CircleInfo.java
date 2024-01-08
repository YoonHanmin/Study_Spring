package com.lgy.spring_5_2;

public class CircleInfo {
	private Circle circle;
	public void getCircleInfo() {
		if(circle!=null) {
			circle.process();
		}
	}
	public CircleInfo(Circle circle) {
		
		this.circle = circle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
}
