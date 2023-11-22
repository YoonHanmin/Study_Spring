package question01;

import java.util.Scanner;

public class Won2Dollar {
			public static void main(String[] args) {
				final int RATE = 1100; // 환율값은 고정이기때문에 상수로 지정
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("원화를 입력하세요(단위 원)>>");
				int won = scanner.nextInt();
				double dollor = won/RATE;
							System.out.println(won+ "원은  $"+ dollor + " 입니다.");
				scanner.close();
			}
}
