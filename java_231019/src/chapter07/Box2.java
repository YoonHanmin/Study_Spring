package chapter07;

// 제네릭 타입 파라미터로 T를 줬는데, 아직 어떤 타입인지는 정하지 않았다.
public class Box2<T> {
	private T t;
//	객체,클래스,변수 뭐가올지 모른다.

//	타입파라미터를 메소드의 리턴타입으로 사용, 제네릭 T타입의 t를 반환한다.
	public T get() {
		return t;
	}
// 타입 파라미터를 메소드의 매개변수 타입으로 사용한다.
	public void set(T t) {
		this.t = t;
	}
	
	
	
}
