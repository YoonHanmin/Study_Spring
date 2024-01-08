package com.lgy.spring_3_2;

public class Median {
	public void process(int a,int b,int c) {
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
}
