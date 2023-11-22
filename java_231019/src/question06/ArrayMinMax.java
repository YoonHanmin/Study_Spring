package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		System.out.print("양수 10개를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		
		}
	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>Max) {
				Max = arr[i];
			}
			if(arr[i]<Min) {
				Min = arr[i];
			}
			
			
		}
		System.out.println("가장 작은 수는"+ Min+"이고, 가장 큰 수는"+ Max+"이고, 최소값+최대값은"+
		(Min+Max)+"입니다.");
	
	
	}
}
