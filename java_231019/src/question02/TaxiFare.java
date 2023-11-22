package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fare;
		int income = 0;
		for(int i=0;i<10;i++) {
			System.out.print("요금을 입력하세요: ");
			fare = scanner.nextInt();
			income += fare;
			
		}
		
		for(int i=0;i<12;i++) {}
		System.out.println("총 수입 : "+ income);
		scanner.close();
	}
}

