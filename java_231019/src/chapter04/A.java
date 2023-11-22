package chapter04;

public class A {
	
	A a1=new A(true);
	A(){}
	public A(boolean b) { }
	A(int b) { } // default 접근 지정자
//	private A(String s) { }
	// private는 같은 클래스만 가능, 다른 패키지도 안됨
}
