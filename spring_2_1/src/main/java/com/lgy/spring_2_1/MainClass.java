package com.lgy.spring_2_1;

public class MainClass {
	public static void main(String[] args) {
		// MainClass가 Calculation 클래스에 의존 : calculation 객체를 생성해서 값을 주입시켜서 사용하기때문. 
		Calculation calculation = new Calculation();
		// calculation 객체 생성해서 값을 주입
		// 의존+주입(Dependency Injection)
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();
	}
}
