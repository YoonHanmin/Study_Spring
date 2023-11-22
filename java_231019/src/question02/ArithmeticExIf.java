package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;

		System.out.print("연산>>");
		int first = scanner.nextInt();
		String car = scanner.next();
		int second = scanner.nextInt();
		if (car.equals("+")) {
			result = first + second;

		} else if (car.equals("-")) {
			result = first - second;

		} else if (car.equals("*")) {
			result = first * second;

		} else if (car.equals("/")) {
			if (second == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				// break는 반복문에서 사용
				return; // 조건문에서 프로그램 종료
			} else {
				result = first / second;
				System.out.println(first + car + second + " 의 계산 결과는 " + result);
			}
		} else {
			System.out.println("사직연산이 아닙니다.");
		}
		System.out.println(first + car + second + " 의 계산 결과는 " + result);

		scanner.close();

	}
}
