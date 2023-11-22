package chapter05;

public class InstanceofExample {
	public static void method1(Parent parent) {
//		instanceof : 객체가 해당 클래스타입인지 판단(참/거짓)
//		Parent parentA = new Child() : parentA는 Child 객체이기 때문에 if 조건 - 참
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 -Child로 변환 성공");
		} else {
			System.out.println("method1 -Child로 변환 실패");

		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
		
		
	
	
	
	public static void main(String[] args) {
//		upcasting
		Parent parentA = new Child();
		method1(parentA);
		Parent parentB = new Parent();
		method1(parentB);
//		Child ch = (Child)new Parent();
//		method1(parentA);
		
	}
	
	
}
