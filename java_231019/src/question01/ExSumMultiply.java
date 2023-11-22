package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3자리수 정수 입력(100~999)>>");
		int number = scanner.nextInt();
		int hundredRest = number%100;
		int ten = hundredRest/10;
		int one = hundredRest%10;
		int first= number/100;
		int second = (number-(first*100))/10;
		int third = number-(first*100+second*10);
		System.out.println("100의 자리와 10의 자리의 합은" + (first + second));
		System.out.println("10의 자리와 1의 자리의 곱은 "+ (second*third));
		scanner.close();
	}
}
