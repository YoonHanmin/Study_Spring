package chapter13;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
	
//	주어진 Function 인터페이스로 람다식 객체를 구현했다. 
//	Function<T,R> 은 T타입의 매개변수를 받아서 R타입의 객체로 반환한다. 실행 메소드는 apply(T t)
	Function<Integer, Integer> f1 = i -> i*4;
	System.out.println(f1.apply(3));
	
	Function<String,Integer> f2 = s -> s.length(); // apply메소드를 오버라이딩한것
	System.out.println(f2.apply("hello"));
	
	
}
}