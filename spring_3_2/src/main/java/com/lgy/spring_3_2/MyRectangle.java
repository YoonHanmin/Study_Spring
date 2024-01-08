package com.lgy.spring_3_2;

public class MyRectangle {
	private Rectangle rect;
	private int width,height;
	
	public void ar() {
		rect.area(width, height);
		
	}
	
	public Rectangle getRect() {
		return rect;
	}
	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
