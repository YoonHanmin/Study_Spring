package chapter02;

public class CastingExample {
		public static void main(String[] args) {
			int intValue = 44032;
			// int 타입을 char로 바로 저장할려고하면 오류
			// char charValue = intValue;
			char charValue = (char) intValue;
			System.out.println(charValue);
			
			//long longValue = 500;
			// long longValue = 5_000_999_888l;
			// 정수 큰타입에서 작은타입으로 변환
			//intValue = (int)longValue;
			// System.out.println(intValue);
			// long 타입의 숫자가 int로 강제변환하면서 숫자가 잘려서 706,032,592로 저장
			double doubleValue=3.14;
			intValue=(int)doubleValue;
			System.out.println(intValue);
		
		}
}
