package chapter03;

public class ThrowsExample {
	public static void main(String[] args) {
//		try {
			findClass();
//		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("메인에서 뜸");
		}

		
		
		
//	}
//	throws : findClass 메소드를 실행하다가 해당 예외가 발생되면, 호출 한곳으로 떠넘긴다.
	public static void findClass()  {
//		Class.forName("java.lang.String2");
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// 예외 발생시 출력되는 기본 메시지를 출력하는 메소드
			System.out.println("메소드에서 뜸");
		}
		
	}
}
