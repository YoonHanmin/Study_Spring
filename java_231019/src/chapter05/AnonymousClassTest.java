package chapter05;

interface RemoteControl{
	void turnOn();
	void turnOff();
}


public class AnonymousClassTest {
	public static void main(String[] args) {
	RemoteControl rc = new RemoteControl() {
//		외부에 인터페이스 이름으로 정의 -> 익명 클래스 객체 생성
//		익명클래스의 메소드 구현
		@Override
		public void turnOn() {
			System.out.println("TV turnOn");
		}
		@Override
		public void turnOff() {
			System.out.println("TV turnOff");
		}
		
	};
		rc.turnOn();
		
		
	}
}
