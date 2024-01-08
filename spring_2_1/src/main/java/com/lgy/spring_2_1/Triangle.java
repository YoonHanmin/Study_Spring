package com.lgy.spring_2_1;

public class Triangle {
	private int a,b,c;
	
	public void process() {
		if((a+b>c)||(b+c>a)||(a+c>b)) {
			System.out.println("삼각형이 됩니다.");
		}else {
			System.out.println("삼각형이 안됩니다.");
			
		}
		
	}
	
	public Triangle(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
