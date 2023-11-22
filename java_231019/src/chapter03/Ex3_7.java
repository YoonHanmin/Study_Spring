package chapter03;

public class Ex3_7 {

	public static void main(String[] args) {
			int[] evens = {0,2,4,6,8,10,12,14,16,18};
			int[] primes = {2,3,5,7,11,13,17,19};
//			1.짝수배열을 메소드 매개변수로 호출
//			5. sum 메소드에서 반환된 sum값을 변수에 저장
			int evenSum = sum(evens);
			int primesSum = sum(primes);
	
	
	
	
//	int 배열을 파라미터로 받는 메소드 sum
	}
	// 2.arr로 evens를 받는다.	
	public static int sum(int[] arr) {
		int sum=0;
//		3.arr 배열 원소를 가지고 반복(0,2,4,6,8,10,12,14,16,18)해서 합계 구함
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		4. 합계를 반환
		return sum;
	}
	
	
}
