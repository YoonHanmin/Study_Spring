package question06;

import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scan.nextInt();
		boolean[] arr2 = new boolean[100];
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			arr2[arr[i]-1 ] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					for (int k = 0; k < arr2.length; k++) {
						if (arr2[k] == false) {
							arr[j] = k;
							arr2[k]=true;
						}
					}

				}
			}

		}
		for (int j = 0; j < arr.length; j++) {
			if(j==0) {
			System.out.print(arr[j] + " ");
		}else if(j%10==0) {
			System.out.println();
		}else { System.out.print(arr[j]+" ");}
	}
}
}
