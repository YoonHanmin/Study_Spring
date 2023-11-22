package question01;

import java.util.Scanner;

public class SumMultiply {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("2개의 실수 입력>>");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println("두수의 합은 "+ (a+b));
			System.out.println("두수의 곱은 "+ (a*b));
			scanner.close();
		
		}
}
