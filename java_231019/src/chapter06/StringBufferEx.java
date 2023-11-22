package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This");
		System.out.println(sb);
		sb.append(" is pencial"); // 문자열을 연결한다.
		System.out.println(sb);
		
		sb.insert(7," my"); // 7번 인덱스 다음에 my 삽입.
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // 8~10까지 your로 대체
		sb.delete(8, 13); // 8~13번 인덱스 삭제
		sb.setLength(4); // 문자열 길이 수정(나머지 다 짜름)
	}
}
