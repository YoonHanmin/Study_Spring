package chapter10;

class ThreadEx1 extends Thread{
	@Override
	public void run() { //스레드 구현
		for (int i = 0; i < 5; i++) {
			System.out.println("i: "+i);
		}
	}
}
class ThreadEx2 implements Runnable{
	@Override
	public void run() { //스레드 구현
		for (int k = 10; k < 15; k++) {
			System.out.println("k: "+k);
		}
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1();
//		Thread t2 = new Thread(new ThreadEx2());
		Runnable r = new ThreadEx2(); //위와 같은 방식, 인터페이스도 참조 변수를 선언할수있다.
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
	}
}
