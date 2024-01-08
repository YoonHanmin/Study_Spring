package com.lgy.spring_2_1;

public class ThreeDivandRemains {
	public static void main(String[] args) {
		Three th = new Three();
		th.setNum(129);
		DivAndRemains div = new DivAndRemains();
		div.setNum(77);
		th.find();
		div.findEqual();
		
	}
}
