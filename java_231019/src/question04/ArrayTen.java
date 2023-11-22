package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			
		}
		System.out.println("합계는 : "+ sum);
	}
}
