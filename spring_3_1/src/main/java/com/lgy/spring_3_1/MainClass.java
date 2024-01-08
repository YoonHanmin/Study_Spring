package com.lgy.spring_3_1;

public class MainClass {
	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		// MyCalculator 객체의 필드인 Calulator 객체를 생성해서 넣어줬음.
		myCalculator.setCalculator(new Calculator());
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		// myCalculator 객체의 add() 메소드는 Calculator 객체의 addition()메소드를 호출 
		myCalculator.add();
		
	}
	
}
