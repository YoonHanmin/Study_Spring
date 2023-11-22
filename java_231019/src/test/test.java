package test;

import java.util.Scanner;

/*
 * 윤한민
 */

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String password = "myongji60";
		String input = "";
		int trynumber = 0;
//		try number가 0부터 3보다 작을때까지 반복
		while (trynumber < 3) {
			System.out.print("암호를 입력하세요: ");
			input = scanner.next();
//			암호 입력할때마다 try number 1 증가
			trynumber += 1;
//			input값과 password값이 같다면, 환영문구 출력후 반복종료
			if (input.equals(password)) {
				System.out.println("환영합니다");
				break;
//			password가 일치하지않으면서 try number가 3이 아니라면 다시 위로 돌아가 재입력	
			} else if(trynumber!=3) {
				System.out.println("암호가 틀립니다");
//			try number가 3이되면 해당 문구를 출력하고 while 조건문에 의해 종료.	
			}else {
				System.out.println("접속을 거부합니다");
				scanner.close();
			}
		}
	}
}
