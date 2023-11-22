package question03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		boolean multiple = false;
		
		// if문 하나로 else if,switch 전부다 쓸수있다.
		if(number%3==0) {
			System.out.println("3의 배수이다.");
			multiple=true;
		}
		if(number%5==0) {
			System.out.println("5의 배수이다.");
			multiple=true;
		}
		if(number%8==0) {
			System.out.println("8의 배수이다.");
			multiple=true;
		}
		if(multiple==false) {
			System.out.println("어느 배수도 아니다.");
			
		}
		
		
		
		
		
		
		
//		do {
//			System.out.print("양의 정수를 입력하세요: ");
//			number = scanner.nextInt();
//			
//			if(number%3==0) {
//				System.out.print("3의 배수이다.");
//				multiple = true;
//			}else if (number%5==0) {
//				System.out.println("5의 배수이다.");
//				multiple = true;
//				
//			}else if (number%8==0) {
//				System.out.println("8의 배수이다.");
//				multiple = true;
//						
//			} 
//			
//			if(multiple==false) {
//				System.out.println("어느배수도 아니다.");
//			}
//			
//									
//		}
//		while(multiple); 
	}
}
