package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.print("정수를 입력하세요: ");
		num=scanner.nextInt();	
		int hour = num/3600;
		int minute = (num%3600)/60;
		int second = num%60;
		System.out.println("num 초는"+ hour + "시간"+minute+"분"+second+"초입니다.");
		scanner.close();
	}
}
