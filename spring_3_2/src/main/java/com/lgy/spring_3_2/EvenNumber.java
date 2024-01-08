package com.lgy.spring_3_2;

public class EvenNumber {
	public void process(int num) {
		int rs=0;
		for (int i = 0; i < num; i++) {
			if(i%2==0) {
				rs += i;
			}
			
		}
		System.out.println(num+"까지 짝수들의 합계는"+rs);
	}
}
