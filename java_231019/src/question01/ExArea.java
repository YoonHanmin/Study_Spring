package question01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수 3개를 입력하시오>>");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
		
	if (c==0) { float triangle = (a*b)/2;
		System.out.println("삼각형의 넓이는" + triangle);
	} else { System.out.println("사다리꼴의 넓이는 " + (a+b)*c/2);}
}
	}