package com.lgy.spring_3_2;

public class MyEven {
	private EvenNumber even;
	public void pr() {
		even.process(num);
	}
	
	public EvenNumber getEven() {
		return even;
	}
	public void setEven(EvenNumber even) {
		this.even = even;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private int num;
	
}
