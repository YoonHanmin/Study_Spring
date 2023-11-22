package chapter10;
// Runnable 인터페이스를 상속 받아 구현
public class TimerRunnable implements Runnable{
	int n=0;
	@Override
	public void run() {

		System.out.println(n);
		n++;
		try {
			Thread.sleep(1000); //sleep는 Thread의 static method.
		}
		 catch (InterruptedException e) {		
			e.printStackTrace();
		 }
	}

}
