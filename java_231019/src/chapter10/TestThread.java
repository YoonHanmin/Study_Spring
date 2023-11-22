package chapter10;


public class TestThread {
	public static void main(String[] args) {
//		Thread 클래스를 상속받아 run 메소드를 내가원하는 작업으로 오버라이딩한 TimerThread 객체 생성
		TimerThread th= new TimerThread();
		th.start(); // thread 작업 시작은 start()메소드로 시작한다.
	}
}
