package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
	 
		System.out.println("2자리수 정수 입력(10~99)>>");
		int number = scanner.nextInt();
		int firstNum = (number/10);
		int secondNum = (number-(firstNum*10));
		if(firstNum==secondNum) {
			System.out.println("yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("no. 10의 자리와 1의 자리가 다릅니다.");			
		}
		}
	}
	


