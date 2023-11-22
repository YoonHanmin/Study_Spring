package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
	System.out.println("입력 데이터= "+numbers);
//	스트림 객체 생성
	
	List<Integer> result = numbers.stream()
//	filter 메소드로 짝수만 추출
			.filter(n->{return n%2 ==0;})
//			map 메소드로 추출된 데이터값들을 매핑하여 제곱
			.map(n->{return n*n;})
			.collect((Collectors.toList()));
	System.out.println("실행결과=" + result);
}
}
