package chapter02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요(0~100) : ");
		char grade;
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		switch (score/10) {
		case 10: 
			grade='A'; // 100점
			// break; 브레이크를 잡아줄 필요가 없음
		case 9:
			grade='A'; // 90~99점
			break;
		case 8:
			grade='B'; 
			break;
		case 7:
			grade='C'; 
			break;
		case 6:
			grade='D'; 
			break;
			
	default: grade = 'F';
			break;
		}
	System.out.println(grade);
	}
	
	
}
		

	 
/*		if (score>= 90) {
						grade='A';
		}else if (score >= 80) {
				grade='B';
			}  
		else if (score >= 70) {
			grade='C';
		}  
		else if (score >= 60) {
			grade='D';
		}  
		else { grade = 'F';
		}
		System.out.println("학점은 "+grade+" 입니다.");
		scanner.close();
	}
*/	

