package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int median = 0; // 초기값 설정
		if ((a < b && b < c) || (c < b && b < a)) {
			median = b;
		} else if ((a < c && c < b) || (b < c && c < a)) {
			median = c;
		} else { median = a;
		}
		System.out.println("중간 값은 " + median);
		scanner.close();
	}
}
