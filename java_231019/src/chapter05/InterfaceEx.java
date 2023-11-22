package chapter05;
// 기본 전화 걸어서 100초 동안 응답없으면 타임아웃하는 PhoneInterface
// 전화 걸기,받기, 화면 출력 기능
interface PhoneInterface{
	int TIMEOUT = 100; // public static final 생략해도 상수 정의 가능
	void sendCall(); // public abstract 생략 가능 sendCall은 추상 메소드
	void receiveCall();
	default void printLogo() { // default를 적어주면 추상이 아니므로 메소드 구현해야함
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("플래시 기능 ON");
	}
	
//	public void printLogo() {
//		System.out.println("**SamsungGaluxyPhone**");
//	}
//	
}

public class InterfaceEx {
		public static void main(String[] args) {
			SamsungPhone phone = new SamsungPhone();
			phone.printLogo(); // 인터페이스의 디폴트메소드를 상속받아 사용가능
			phone.sendCall(); // 추상 메소드 구현해서 사용
			phone.receiveCall();
			phone.flash();
		}
}
