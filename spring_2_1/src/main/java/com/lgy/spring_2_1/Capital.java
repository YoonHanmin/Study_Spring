package com.lgy.spring_2_1;

public class Capital {
	private char alpa;

	public void process() {
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
	
	public char getAlpa() {
		return alpa;
	}

	public void setAlpa(char alpa) {
		this.alpa = alpa;
	}
}
