package chapter03;

public class Ex3_6 {
	static int sum = 0;
	public static int average(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
	} return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] array = {88,76,92,68,55,48,82};
//		int sum =0;
////		arr.length = 7, arr[0]~arr[6]까지 7번 반복
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
		System.out.println(average(array));
	
	}
		
		
		
	}

	
