package chapter14;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sumValue = Arrays.stream(arr).sum(); // 배열 요소의 합을 구하는 stream의 sum 메소드	
		System.out.println(sumValue);
		long count = Arrays.stream(arr).count(); // 배열 요소의 갯수를 구하는 stream의 sum 메소드로 stream의 최종 연산 메소드들중 하나이다.
		System.out.println(count);
	
	}
}
