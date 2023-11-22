package question04;

import java.util.Scanner;

public class ChangeMoney2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scan.nextInt();

		int[] ea = new int[7];
		int[] bill = { 50000, 10000, 1000, 100, 50, 10, 1 };
		for (int i = 0; i < ea.length; i++) {
			ea[i] = money / bill[i];
			money -= ea[i] * bill[i];
			System.out.println(bill[i] + "원짜리 " + ea[i] + "개");
		}
		scan.close();
	}

}
