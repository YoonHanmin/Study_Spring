package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10~99사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		int one = num / 10;
		int two = num % 10;
		int count =0;
		if (one%3 ==0) {
			count++;
		}
		if(two%3==0&& two!=0) {
			count++;
		}
		if(count ==2) {
			System.out.println("박수짝짝");
		} else if(count ==1) {
			System.out.println("박수짝");
			
		}else {
			System.out.println("박수없음");
		}
//		if (one % 3 == 0) {
//			if (two == 3 || two == 6 || two == 9) {
//				System.out.println("박수짝짝");
//			} else {
//				System.out.println("박수짝");
//			}
//		} else if (two == 3 || two == 6 || two == 9) {
//			System.out.println("박수짝");
//		}
	}
	}

