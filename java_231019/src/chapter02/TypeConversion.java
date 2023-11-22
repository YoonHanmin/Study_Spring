package chapter02;

public class TypeConversion {
		public static void main(String[] args) {
			byte b = 127;
			int i = 100;
			// 연산 결과는 큰타입 int로 자동 형변환
			System.out.println(b+i);
			// 기본 타입 int / int 는 int
			System.out.println(10/4);
			// double , int 는 double
			System.out.println(10.0/4);
			// 실수끼리 연산 결과는 실수
			System.out.println(2.9+1.8);
			// 2.9를 강제 형변환을 통해 정수형 2로 변경, 2 +1.8 = double
			System.out.println((int)2.9+1.8);
			// 2+1 = 3 (int형)
			System.out.println((int)2.9+(int)1.8);
			// (int) 4.7 = int 4
			System.out.println((int)(2.9+1.8));
		}
}
