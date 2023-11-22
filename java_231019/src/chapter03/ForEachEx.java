package chapter03;
/*
 *  열거형 이용 ( values() 메소드를 이용)
 *  for each문 이용 
 */
public class ForEachEx {
	// 열거형 : inner class(내부 클래스) 형태
	enum Week{월,화,수,목,금,토,일};
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		int sum =0;
		String sum1 = "";
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
//		int 타입 배열원소 n을 k로 하나씩 받는다.
		for (int k : n) {
		System.out.println(k+" ");

			sum+= k;
	}
	System.out.println("합은 : " + sum);
//	String 타입 배열 원소 names들을 순서대로 하나씩 string에 받는다.
	for (String string : names) {
	
		
	}
//	Week 타입 값을 day로 하나씩 받는다. values는 enum값을 하나씩 읽어들이는 메소드.
	for (Week day : Week.values()) {
//			열거형값은 String로 받을수 없다.
		//		String str = day;
		Week str = day;
	System.out.print(str);
	}
	
	
	}
}
