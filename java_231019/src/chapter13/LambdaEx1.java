package chapter13;

// 추상 메소드를 하나만 가진 함수형 인터페이스
interface MyFunction{
	int calc(int x,int y); // 람다식으로 구현할 추상 메소드
}



public class LambdaEx1 {
	public static void main(String[] args) {
		MyFunction add = (x,y)->{return x+y;}; // 람다식으로 구현
		MyFunction minus = (x,y) -> x-y; // 람다식 {},return 생략 가능
		System.out.println(add.calc(1, 2)); // 람다식 객체에서 구현된 calc메소드를 호출
		System.out.println(minus.calc(1, 2)); // 람다식 객체에서 구현된 calc메소드를 호출
		
	}
}
