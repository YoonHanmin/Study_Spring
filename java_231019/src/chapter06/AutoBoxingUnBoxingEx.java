package chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
//		Integer intObject = Integer.valueOf(n); // int형 n을 Integer 객체로 박싱
		Integer intObject = n;  // 그냥 Integer형에 int타입 바로넣어도 자동으로 박싱됨.
		System.out.println(intObject);
		
		
//		int m = intObject.intValue() + intObject.intValue(); 언박싱
		int m = intObject+intObject; //그냥 더해버리면 자동으로 언박싱 됨.
				
		
		
		
	}
}
