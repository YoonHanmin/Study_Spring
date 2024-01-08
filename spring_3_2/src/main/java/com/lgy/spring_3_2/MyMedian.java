package com.lgy.spring_3_2;

public class MyMedian {
	private Median median;
	public void pr() {
		median.process(a, b, c);
	}
	
	
	public Median getMedian() {
		return median;
	}
	public void setMedian(Median median) {
		this.median = median;
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
	private int a,b,c;
}
