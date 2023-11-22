package chapter03;
/*
 * 문자열에서 r 알파벳 갯수 구하기
 * toCharArray() 메소드 이용
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count =0;
		String str = "Programming is fun! Right?";
//		toCharArray() : 문자열에서 문자 하나씩 가지고 옴
		char[] chararr = str.toCharArray();
		for (int i = 0; i < chararr.length; i++) {
			if (chararr[i]=='R'||chararr[i]=='r') {
				count++;
			}
		}
		System.out.println("r의 갯수 : " + count);
	}
	
	
}
