package chapter03;
/*
 * do while문 
 * a~z 알파벳 소문자 출력
 */

import java.util.Scanner;

public class DoWhileSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n);
		n = scanner.nextInt();
		System.out.println(n);
		n = scanner.nextInt();
		System.out.println(n);
		
//		int a = 0;
//	char b = (char) ((char)a+34+'b'+'!');
//	int c =b;
//	System.out.println(c);
	}
}
//		char c= 'a';
//		do { 
//			System.out.println(c);
////			c+1 => 문자 + 정수 = 정수
////			c = (char) (c+1); // 자동변환
//			c +=1; //c=c+1 
//		}while (c<='z');
//	}
//}
