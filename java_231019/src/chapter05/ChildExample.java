package chapter05;

public class ChildExample {
	public static void main(String[] args) {
		// Parent 클래스에 기본생성자 만들어서 호출하고,
		// Child 클래스에 기본생성자 만들어서 호출
		Parent parent = new Child(); //up casting
		
		parent.filed1 = "data1";
//		upcasting된 객체는 서브클래스 멤버 접근 불가
//		parant.filed2 = "data2";
//		parent.method3();
//		 down casting 객체는 서브클래스 멤버 접근 가능
		Child child = (Child)parent;
//		child는 다운캐스팅된 parent를 받앗기때문에 서브 클래스 접근 가능
		child.filed2="yyy";
		
		
	}
}
