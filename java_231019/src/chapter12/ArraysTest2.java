package chapter12;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest2 {
	public static void main(String[] args) {
		String[] a= {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		System.out.println(Arrays.asList(a)); // List 컬렉션 형태로 변환
		List<String> list = Arrays.asList(a);
		System.out.println("list.get(3) ==="+list.get(3));
		
		Arrays.sort(b,4,14); // 4번째 부터 14까지 오름차순으로 정리
		System.out.println(Arrays.toString(b));

		Arrays.sort(a,Collections.reverseOrder()); // 배열을 역순으로 뒤집는다.
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,1,3,Collections.reverseOrder()); // 배열을 역순으로 뒤집는다.
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String[] cc= {"11","12","13","13","23","53","223","145","53"};
		Arrays.sort(cc,Collections.reverseOrder());
		System.out.println(Arrays.toString(cc));
		
		int[] c = Arrays.copyOf(b, b.length); // 배열 객체를 복사
		
		String[] d = Arrays.copyOf(a, 3); // a배열을 3까지만큼 복사.
	
	
	}
	}

