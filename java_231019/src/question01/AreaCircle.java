package question01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		double PI = 3.14;
		System.out.print("반지름을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		double circleArea = PI*radius*radius;
		System.out.println("원의 면적은 " + circleArea + "입니다.");
		scanner.close();
	}
}
