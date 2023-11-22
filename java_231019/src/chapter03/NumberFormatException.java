package chapter03;
/*
 * 문자열을 정수로 변환
 * 변환 안될때를 대비해서 예외처리
 */

public class NumberFormatException {
	public static void main(String[] args) {
		String[] stringNumber = {"23","12","3.141592","998"};
		int i;
		
		for (i = 0; i < stringNumber.length; i++) {
//			문자열을 정수형으로 받아서 오류
//			int j = stringNumber[i];
//			String j = stringNumber[i];
//			Integer Wrapper클래스의 parseInt 메소드를 사용해 문자열을 정수로 변환
		try {
			
			int j = Integer.parseInt(stringNumber[i]);
			System.out.println("숫자로 변환된 값은 "+j);
		}catch(Exception e) {
			System.out.println(stringNumber[i]+"는 정수로 변환할수없습니다.");
		}
			
			
		}
	}
}
