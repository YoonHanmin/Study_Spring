package chapter10;
// Thread클래스는 Runnable 인터페이스를 구현한 클래스이다.
public class TimerThread extends Thread {
	int n=0;
	@Override
//	Thread 클래스의 run 메소드를 오버라이딩해서 사용. 
	public void run() { //스레드에서 실행하고자 하는 코드 작성
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} // 1000분의 1초 만큼 작업을 쉬는 메소드 :즉 while 무한루프를 돌면서 1초간격으로 n이 증가한다.
			 catch (InterruptedException e) {		
				e.printStackTrace();
			 }
		}

	}
}
