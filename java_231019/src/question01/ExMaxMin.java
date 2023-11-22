package question01;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = 0;
		int min = 0;
	//  최대값 구하기
		if (a>b&&a>c) {
		max = c;
	}
	else if (b>a&&b>c) {
		max = b;
	}
	else {max = c;}
		
	  if (a<b&&a<c) {
			min = a;
			}
	else if (b<c&&b<a) {
		min = b;
			}
	else {min = c;
			}
	  System.out.println("최대값은 :" + max);
	  System.out.println("최소값은 :" + min);
	scanner.close();
	
	}
}
