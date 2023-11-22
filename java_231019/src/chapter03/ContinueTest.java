package chapter03;

public class ContinueTest {
	public static void main(String[] args) {
		int count = 0;
//		알파벳 n의 갯수 구하기
		String s="no news is good news";
//		length() : 공백을 포함한 문자열의 갯수를 구하는 메소드
		for(int i=0; i<s.length();i++) {
//			charAt : 문자를 가져오는 메소드
//			System.out.println(s.charAt(i));
		if(s.charAt(i)!='n') {
			continue; //n이 아니면(참이면) count++;를 건너뛰고 for문의 i++로 가라.
		}
		count++;
		}
		System.out.println("문장에서 발견된 n의 갯수 : " + count);
	}
	
}
