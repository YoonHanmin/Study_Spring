package question06;

import java.util.Random;

public class twoDArray {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		Random rd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][0]= rd.nextInt(10)+1;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rd.nextInt(10)+1;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
