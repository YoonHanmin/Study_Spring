package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요.");
		double[] arr = new double[5];
		double sum =0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		double aver = sum/arr.length;
		System.out.println("평균은 :" + aver);
		
	}
}
