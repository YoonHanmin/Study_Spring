package com.lgy.spring_2_1;

public class RectangleMedian {
	public static void main(String[] args) {
		Rectangle2 rt = new Rectangle2();
		Median med = new Median();
		rt.setX(150);
		rt.setY(150);
		med.setA(20);
		med.setB(100);
		med.setC(33);
		rt.process();
		med.process();
		
	}
}
