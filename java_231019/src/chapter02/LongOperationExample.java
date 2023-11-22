package chapter02;

public class LongOperationExample {
		public static void main(String[] args) {
			byte value1=10;
			int value2=100;
			long value3=1000;
			// long타입이기때문에 오류
			// int result = value1+value2+value3;
			int result =(int)(value1+value2+value3);
			System.out.println(result);
		}
}
