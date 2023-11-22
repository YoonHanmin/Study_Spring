package question01;

import java.util.Scanner;

public class ExExchange {
		public static void main(String[] args) {
			final double DOLLOR_RATE = 1200.0;
			final double EURO_RATE = 1500.0;
			Scanner scanner = new Scanner(System.in);
			System.out.print("원화를 입력하세요(단위 원)>>");
			int won = scanner.nextInt();
			double dollor = won/DOLLOR_RATE;
			double euro =  won/EURO_RATE;
			System.out.println(won + "원은 $" + dollor+"입니다.");
			System.out.println(won + "원은 $" + euro+"입니다.");
			scanner.close();
			
		}
}
