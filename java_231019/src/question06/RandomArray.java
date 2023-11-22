package question06;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100)+1;
			if(i==0) {
				System.out.print(arr[i]+" ");
			}
			else {
				if(i%10==0) {
					System.out.println();
				}
				System.out.print(arr[i]+" ");
			}
		
	}
	}
}

