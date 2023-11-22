package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		배열 최대값,최소값을 구할때 초기 max,min의 값을 설정하는 방법 2가지
//		1번 : for문 첫 실행때 배열 첫번째 값을 저장
//		2번 : max,min 값을 아예 int의 최고,최소 정수(-21억)를 넣고 비교
		
//		2번째 방법.
		int min=Integer.MAX_VALUE;
		System.out.println("양수 7개를 입력하세요.");
		int[] arr = new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
//			첫번째 방법.
//			첫번째 반복할때 min의 값을 arr[0]으로 저장
//			if(i==0) {
//				min = arr[i];
//			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
	
		
		
		
		
		
		
		
//		System.out.println("양수 7개를 입력하세요.");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		int min = arr[0];
//		
//		for (int i : arr) {
//			if(i>min) {
//				min = i;
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				min = Math.min(min,arr[j]);
//				
//			}
//			}
		System.out.println("가장 작은수는 "+ min + "입니다.");
		}
	
}
