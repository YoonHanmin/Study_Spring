package chapter06;

public class WrapperEx {
	public static void main(String[] args) {
		char c1='4', c2='F';
		if(Character.isDigit(c1)) { // isDigit 숫자 체크하는 메소드
			System.out.println("숫자");
		}else {
			System.out.println("아님");
			
		}
		if(Character.isAlphabetic(c2)) { // isAlphabetic 알파벳 체크하는 메소드
			System.out.println("알파벳임");
		}else {
			System.out.println("아님");
			
		}
		
		System.out.println(Integer.parseInt("-123")); //문자열을 정수로 변환
		System.out.println(Integer.toHexString(28)); // 정수를 16진수로 변환
		System.out.println(Integer.toBinaryString(28)); // 정수를 2진수로 변환
		System.out.println(Integer.bitCount(28)); // 2진수중 1의 개수를 카운트
		
		
	}
}
