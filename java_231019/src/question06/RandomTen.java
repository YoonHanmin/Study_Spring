package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[10];
		double sum = 0;
		System.out.print("랜덤한 정수들 :"); 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10)+1;
			System.out.print(arr[i] + " ");
			
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		System.out.print("평균은 :"+ sum/arr.length);
		
	}
}
