package question03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		int num =0;
		int result =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		
		for(int i=0;i<5;i++) {
		num=scanner.nextInt();
		if(num<=0) {
			continue;
		}
		result+=num;
		}
		System.out.println("양수의 합은 : "+ result);

		
		
		//		int i= 0;
//		while(i<5) {
//			num = scanner.nextInt();
//			if(num>0) {
//				result += num;
//			} else {
//				continue;
//			}
//			break;
//		}
//		System.out.println("양수의 합은 : "+ result);
	
	}
	}
