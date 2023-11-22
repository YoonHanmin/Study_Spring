package chapter04;

import java.util.Scanner;

class CurrencyConverter{
//	static 변수는 일반적으로 private 사용
//	변수는 private로 만들고 getter setter 메소드를 통해 변수에 접근(직접적인 값 수정을 막는다.)
	
	
	private static double rate;
	
//	set을 통해 private 값 설정
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	
}




public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1달러 환율>>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+" 입니다.");
		System.out.println("100$는"+CurrencyConverter.toKWR(1390)+" 입니다.");
		
	
	
	}
}
