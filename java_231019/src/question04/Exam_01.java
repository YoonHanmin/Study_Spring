/* 231019_(디지털컨버전스 혼합) 자바(JAVA)기반 웹 
 * & 데이터 융합개발자(스프링, 오라클)양성과정 23-6
 * 윤한민
 */
package question04;
import java.util.Scanner;
public class Exam_01 {
	public static void main(String[] args) {
//		변수 선언 및 초기화
		double radius,height,volume = 0; 
//		Scan 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
//		scan.nextDouble()메소드를 통해 입력된 값을 radius에 저장
		radius = scan.nextDouble();
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
		height = scan.nextDouble();
//		원뿔의 부피 = 1/3πr^2h
//		double형 변수 volume에 원뿔의 부피를 계산한 결과값 저장 		
		volume = (Math.PI*radius*radius*height)/3;
//		원뿔 밑원 반지름, 높이 , 부피값 출력
		System.out.println("원뿔 밑의 원의 반지름: "+radius);
		System.out.println("원뿔의 높이: "+height);
		System.out.println("원뿔의 부피: "+volume);
		scan.close();
	}
}
