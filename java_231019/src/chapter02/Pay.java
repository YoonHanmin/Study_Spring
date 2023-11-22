package chapter02;
/*
 * 시간을 입력 받아서 임금 계산
 */

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
			final int RATE = 10000; // 최저임금
			int hour; // 근무시간
			int pay; // 급여 = 시간*시간당임금
			System.out.print("시간을 입력하시오 : ");
			Scanner scanner = new Scanner(System.in);
              hour = scanner.nextInt();
              // 8시간 초과 : 1.5배
        if (hour>8) {
        	pay =(int)(RATE * 8 + (1.5*RATE*(hour-8)));
			
		} else {
			pay = RATE * hour;
		}
        System.out.println("급여는 " + pay+ "입니다.");
	}
	
}
