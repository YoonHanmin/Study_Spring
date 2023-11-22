package chapter02;

import java.util.Scanner;

public class SuccessOrFail {
			public static void main(String[] args) {
				System.out.println("점수를 입력하시오 : ");
			Scanner scanner = new Scanner(System.in);
			int score = scanner.nextInt();
			if(score >=80) {
				System.out.println("축하합니다! 합격입니다.");
			}
			else { System.out.println("불합격입니다.");}
			}
}
