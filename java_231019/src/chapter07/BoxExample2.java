package chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
//		Box2<String>box1  = new Box2<String>();
//		제네릭의 데이터 타입은 String, 자바7부터 생략가능.
		Box2<String> box1 = new Box2<>();
//		box1.set("hello");
		box1.set("hello");
//		컴파일 단계에서 제네릭 타입을 감지한다.
		String greet = box1.get();	
		System.out.println(greet);	
		Box2<Integer> box2 = new Box2<>();
//		box2.set("hello"); box2의 타입은 Integer이므로 정수형만 가능
		box2.set(777);
//		auto unboxing : Integer -> int 
		int value =box2.get();
		System.out.println(value);
	}
	
}