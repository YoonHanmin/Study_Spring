package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box=new Box();
		box.set("홍길동"); // set 메소드의 파라미터는 Object 타입이고,
//		return object를 리턴하기때문에  Object 타입이 리턴됨.
//		Object object = "홍길동"
		//String name = box.get(); // String <-> Object 타입 오류
		String name = (String)box.get();
		System.out.println(name);
		box.set(777);
//		Object object = 777
		
		int number = (int)box.get();
		
//		Object object = new Apple(); upcasting
		box.set(new Apple());
		Apple apple = (Apple)box.get();
//		down casting (Object -> Apple)
		System.out.println(apple);
//		Object 객체의 경우에는 up casting, down casting을 수시로 해줘야 하기에
//		성능 차이가 난다.

			
		
		
	}
}
