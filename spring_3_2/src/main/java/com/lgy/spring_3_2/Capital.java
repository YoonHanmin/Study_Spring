package com.lgy.spring_3_2;

public class Capital {
	public void process(char alpa) {
		int A = 65;
		for (int i = alpa-'A'; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print((char)A);
					A+=1;
			}
			A=65;
			System.out.println();
			
		}
		
	}
}
