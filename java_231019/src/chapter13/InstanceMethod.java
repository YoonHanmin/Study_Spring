package chapter13;

import java.util.function.Supplier;

public class InstanceMethod {
	
//	Supplier 인터페이스는 매개변수 없고 반환값만 있다. 반환타입은 Integer, 실행 메소드는 get
	static void print(Supplier<Integer> f) {
		System.out.println(f.get());
	}
public static void main(String[] args) {
	String s= "Hello World!";
	System.out.println(s.length());
//	print의 매개변수에 람다식을 넣었다. 즉, Supplier<Integer> f = () -> s.length();
	print(()->s.length());
//	위를 축약해서 메소드 참조한 것
	print(s::length);
}
}
