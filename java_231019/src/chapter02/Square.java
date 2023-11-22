package chapter02;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Square {
		public static void main(String[] args) {
			// void : 리턴 타입(리턴 할것이 없다)
			square(3); // 메소드 호출부
		}
		/* 메소드명 : square
		 * 
		 */
		public static int square(int n) { // 메소드 정의부
			return n*n; // 리턴타입 불일치시 오류
		}
}
