package com.lgy.spring_2_1;

public class DivAndRemains {
	private int num;

	public void findEqual() {
		int first,second;
		first = num/10;
		second = num%10;
		if(first==second) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
		System.out.println("10의 자리와 1의 자리가 다릅니다.");}
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
