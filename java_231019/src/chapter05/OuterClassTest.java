package chapter05;

class OuterClass{ // 외부 클래스
	private String secret="Time is money";
	public OuterClass() { //외부 클래스의 생성자로 내부클래스 객체 생성
		InnerClass obj = new InnerClass();
		obj.method();
	}
	public class InnerClass{ //내부 클래스
		public InnerClass(){
			System.out.println("내부클래스의 생성자입니다.");
		}
		public void method() {
			System.out.println(secret); // 내부에서 외부클래스의 private에 접근 가능
		}
	}
}


public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
//		new InnerClass(); // 내부 클래스 객체 접근 제한
//		outer.secret = ""; // private이면 접근 제한
	}
}
