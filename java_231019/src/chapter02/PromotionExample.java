package chapter02;

public class PromotionExample {
		public static void main(String[] args) {
			// 작은타입에서 큰 타입으로 자동 변환
			byte byteValue = 10;
			int intValue = byteValue;
			System.out.println("intValue : " + intValue);
			
			char charValue = '가';
			// 변수에 유니코드가 저장
			intValue = charValue;
			System.out.println("intValue : " + intValue);
			intValue = 50;
			long longValue = intValue;
			System.out.println("longValue : " + longValue);
		
			long alongValue=3_020_303_400L;
			float floatValue = alongValue;
			System.out.println("floatValue : " + floatValue);
			// 정수가 실수로, 작은 타입이 큰타입으로 자동변환
			floatValue=100.5F;
			double doubleValue = floatValue;
			System.out.println("doubleValue:" + floatValue);
		
		
		}
}
