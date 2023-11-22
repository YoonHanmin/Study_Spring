package chapter03;

public class ReturnArray {
	
	static int[] makeArray() {
//		배열 생성시 타입이 불일치시 오류
//		int temp[] = new String[4];
		int temp[]=new int[4];
	
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
//		리턴 타입은 메소드 타입과 일치해야함.
		return temp;
	}
	
	
	
	public static void main(String[] args) {
		int intArray[];
//		메소드를 호출하면 temp 배열을 받는다.
//		
		intArray = makeArray();
	for (int i = 0; i < intArray.length; i++) {
		System.out.print(intArray[i]+ " ");
	}
	
	}
}
