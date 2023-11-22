package chapter02;

public class ByteOperationExample {
		public static void main(String[] args) {
			// 연산식으로 저장
			byte result1=10+20;
			System.out.println(result1);
			byte x=10;
			byte y=20;
			// x+y가 연산되어서 int로 자동변환되어버렸음.
			// byte result2 = x+y;
			byte result2 = (byte)(x+y);
			System.out.println(result2);
		}
}
