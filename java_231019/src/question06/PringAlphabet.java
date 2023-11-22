package question06;

import java.util.Scanner;

public class PringAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s= scanner.next();
		char c = s.charAt(0);
//		-1씩 감소하면서 이전 알파벳 출력
		for(char i='a';i<='a';i--) { //c까지만 반복
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		//		String alpa = scanner.next();
//		String str = "abcd";
//		String strr = str+alpa;
//		for (int i = strr.length();i>0;i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(strr.charAt(j));
//			}
//			System.out.println();
//		}
//		
	}
}