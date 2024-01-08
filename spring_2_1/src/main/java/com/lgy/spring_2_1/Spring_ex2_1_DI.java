package com.lgy.spring_2_1;



public class Spring_ex2_1_DI {
	public static void main(String[] args) {
		
		// 이 클래스는 Circle 클래스에 의존한다.
		// circle객체를 생성해서 값을 주입시켜줬다.
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		
		circle.setRadius(10);
		rect.setHeight(30);
		rect.setWidth(20);
		circle.area();
		rect.area();
		
		
		
	}
}
