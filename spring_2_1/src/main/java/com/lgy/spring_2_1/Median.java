package com.lgy.spring_2_1;

public class Median {
	private int a,b,c;
	
	public void process() {
		int rs =0;
		if((a>b&&b<c)||(c>b&&b<a)) {
			rs= b;
		}
		if((a>c&&b<c)||(b>c&&a<c)) {
			rs= c;
		}
		if((a>b&&a<c)||(a>c&&a<b)) {
			rs= a;
		}
		System.out.println(a+""+b+""+c+"의 중간값은"+rs);
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
