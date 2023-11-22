package package22;

import package21.A;

public class C {
	public C() {
		A a=new A();
	a.filed1=2;
//	a.filed2=2; private,default는 다른 패키지에서 접근불가
//	a.filed3=2;
	a.method1();
	
	
	}
}
