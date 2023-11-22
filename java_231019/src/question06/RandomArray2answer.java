package question06;

import java.util.Scanner;

public class RandomArray2answer {
//	배열의 중복값을 찾는 메소드 (배열,몇번 인덱스까지?, 난수)
	public static boolean exists(int a[], int to,int r) {
		for (int i = 0; i < to; i++) {
			if(a[i]==r) {
				return true;
			}
		}return false;
	}
	
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random()*100)+1;
//			배열의 i값이 중복값이면 다시반복 (i--;) continue
			if(exists(arr,i,r)) {
//				i--; continue : 내가 원하는 조건을 만족할때까지 다시 반복해라.
				i--;
				continue; // continue가 없으면 for문 안에 다음줄로 내려가서 실행하므로, continue있어야 바로 i++위로 올라감. 
			}
			
			arr[i] = r;
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
