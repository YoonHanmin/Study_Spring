package com.lgy.spring_3_2;

public class MyRect {
	private Rect rect;
	
	public void pr() {
		rect.process(x, y);
	}
	public Rect getRect() {
		return rect;
	}
	public void setRect(Rect rect) {
		this.rect = rect;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private int x,y;
}
