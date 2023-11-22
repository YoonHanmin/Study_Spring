package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a=new String(" C#");
		String b=new String(",C++ ");
		
		
		a = a.concat(b); // 합쳐진 문자열을 새로만들어서 가리킴.
		
		a = a.trim(); // 앞,뒤 공백제거
		
		a.replace("C#", "Java"); //문자열 대체
		
		
		
		String s[] = a.split(","); // ","기준으로 문자열을 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열"+i+":"+s[i]);
		}
		
		a = a.substring(5); // 인덱스값으로 시작하는 문자열, 5번째 자리부터 끝까지 문자열
		
		
		
	}
}
