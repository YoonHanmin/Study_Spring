package com.lgy.spring_2_1;

public class Three {
	private int num;

	public void find() {
		if(num%3==0) {
			System.out.println(num+" 은 3의 배수");
		}else {
		System.out.println(num+" 은 3의 배수가 아님");}
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
