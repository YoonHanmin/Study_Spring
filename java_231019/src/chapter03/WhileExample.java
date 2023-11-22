package chapter03;

import java.util.Scanner;

/*
 * 정수를 입력받아
 * 입력받은 갯수와 평균 출력
 * 마지막에 -1을 입력 중단
 */
public class WhileExample {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n = scanner.nextInt();
		// n이 -1이 아닐때까지 반복
		while (n != -1) {
			sum += n;

//			입력 받은 갯수를 증가
//        1=0+1,2=1+1,3=2+1,4=3+1
//			count = count+1;
			count++;
//			다시 입력 받음 토큰이 남아있다면 추가입력, 아니면 토큰 사용
			n = scanner.nextInt();

		}
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 갯수 는 " + count + "개 이며");
			System.out.println("평균은 " + (double) sum / count + "입니다.");
		}
		scanner.close();
	}
}
