package chapter13;
@FunctionalInterface
interface Myfunction5<T>{ //제네릭 타입 T를 가진 함수형 인터페이스
	void print(T x);
//	void print2(); 어노테이션이 추상메소드 1개만 쓰도록 체크
}

public class LambdaEx5 {
	public static void main(String[] args) {
//		String 타입의 매개변수 x를 받아서 바로 출력 
		Myfunction5<String> f1=(x)-> System.out.println(x);
		f1.print("ABC");
		Myfunction5<Integer> f2 = (x)->System.out.println(x);
		f2.print(Integer.valueOf(100)); // Integer 객체를 람다식에
		f2.print(100); // auto boxing
	}
}
