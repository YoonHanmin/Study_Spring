package chapter03;

public class LoopExample3 {
	public static void main(String[] args) {
		int i=10;
//		최소 한번 실행은 보장
		do {
			System.out.println("i의 값 :"+i);
			i--; //9로 바뀌고
		} while (i<3); // 거짓으로 종료
	}
}
