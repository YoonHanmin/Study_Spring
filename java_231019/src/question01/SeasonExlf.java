package question01;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int num = scanner.nextInt();
		if ((1 <= num && num <= 2) || num == 12) {
			System.out.println("겨울");
		} else if ((3 <= num) && num <= 5) {
			System.out.println("봄");
		} else if (6 <= num && num <= 8) {
			System.out.println("여름");

		} else if (9 <= num && num <= 11) {
			System.out.println("가을");

		} else {
			System.out.println("잘못입력");
		}
		scanner.close();
	}
}
