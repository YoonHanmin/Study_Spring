package chapter10;

public class ThreadMainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName(); // 현재 실행중인 스레드의 이름
		long id = Thread.currentThread().getId(); // 현재 실행중인 스레드의 고유한 번호
		int priority = Thread.currentThread().getPriority();
		Thread.State s =Thread.currentThread().getState(); //현재 실행중인 스레드의 6가지 상태중 하나
		System.out.println("현재 스레드 이름 : "+name);
		System.out.println("현재 스레드 : "+id);
		System.out.println("현재 스레드 : "+priority);
		System.out.println("현재 스레드 : "+s);
		
		
	
	
	
	}
}
