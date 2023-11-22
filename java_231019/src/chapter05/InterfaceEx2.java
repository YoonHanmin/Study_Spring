package chapter05;

interface PhoneInterface2 {
	int TIMEOUT = 100; // public static final 생략해도 상수 정의 가능

	void sendCall(); // public abstract 생략 가능 sendCall은 추상 메소드

	void receiveCall();

	default void printLogo() { // default를 적어주면 추상이 아니므로 메소드 구현해야함
		System.out.println("**Phone**");

	}
}

interface MobilePhoneInterface extends PhoneInterface2 {
	void sendSMS();

	void receiveSMS();

}

interface MP3Interface {
	void Play();

	void stop();

}

class PDA {
	public int calulate(int x, int y) {
		return x + y;
	}
}

//	계산기능, 문자전송, 음악기능을 상속받음
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	@Override
	public void Play() {
		System.out.println("음악을 연주 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받습니다.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
				phone.printLogo();
				phone.sendCall();
				phone.Play();
				System.out.println(phone.calulate(3, 5));
				phone.schedule();
		
		

	}

}
