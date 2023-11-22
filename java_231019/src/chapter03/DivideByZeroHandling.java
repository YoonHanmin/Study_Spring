package chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		while(true) {
			
			System.out.print("분자를 입력하시오:");
			dividend = scanner.nextInt();
			System.out.print("분모를 입력하시오:");
			divisor = scanner.nextInt();
//		0으로 나누면 예외 발생
//		분자를 입력하시오:10
//		분모를 입력하시오:0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at chapter03.DivideByZero.main(DivideByZero.java:14)
//		불능일때 정상적인 메시지로 처리
			try {
//	불능이 발생할수 있는 실행문
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break;
				//		오류 발생시 처리(try에서 발생시)
			}catch(Exception e) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
				
			}
		}
	
	scanner.close();
	}
}
