package chapter03;

import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오:");
		int sum=0, n=0;
//			정수가 아닌것이 오면 재입력 받게 예외처리
//			Exception in thread "main" java.util.InputMismatchException
		
		
		for (int i = 0; i <3; i++) {
			System.out.print(">>");
			try {
				n=scanner.nextInt();
				
			}catch(Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				scanner.next(); // 입력받은 문자열을 받아버려서 없앤다. 
				i--; // 다시 입력받기 위해서 카운트를 감소한다.
				continue; //합계 누적을 방지하기위해 건너뛴다.
			}
		
			sum +=n;
		
		}
	System.out.println("합은 "+sum);
	
	}
}
