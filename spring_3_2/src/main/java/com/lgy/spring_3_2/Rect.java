package com.lgy.spring_3_2;

public class Rect {
	public void process(int x,int y) {
		if((x>=100&&x<=200)&&(y>=100&&y<=200)) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		}else {
			System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
			
		}
	}
}
