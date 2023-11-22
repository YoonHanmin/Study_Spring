package question02;

import java.util.Scanner;



public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;

		System.out.print("연산>>");
		int first = scanner.nextInt();
		String car = scanner.next();
		int second = scanner.nextInt();
		
		switch(car) {
		case "+" :
			result = first + second;
			break;
		case "-" : 
			result = first - second;
			break;
		case "*" : 
			result = first * second;
			break;
		case "/" : 
			if(second==0) {
				System.out.println("0으로 나눌수 없습니다.");
			return;
			}else {
				result = first / second;}
			break;
			
		default : System.out.println("잘못된 입력");
		break;
			}
		System.out.println(first + car + second + " 의 계산 결과는 " + result);
		scanner.close();}
	}

