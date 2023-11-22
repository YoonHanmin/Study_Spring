package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	public static void main(String[] args) {
		
	
	List<String> sList = new ArrayList<String>();
	sList.add("Tomas");
	sList.add("Edward");
	sList.add("Jack");
	System.out.println(sList);
	Stream<String> stream = sList.stream();
//	바로 최종연산 forEach로 출력
	stream.forEach(s->System.out.print(s+" "));
	System.out.println("\n-----------------------");
//	 1. stream 객체생성 2.sorted 중간연산   3. 최종연산
//	 sorted : 정렬연산
	sList.stream().sorted().forEach(s->System.out.print(s+" "));
	System.out.println("\n-----------------------");
//	map : 데이터를 변형 할 때 사용한다. -> 기존의 sList값들을 길이로 변경
	sList.stream().map(s->s.length()).forEach(n->System.out.print(n+" "));
	
	System.out.println();
	sList.stream().filter(s->s.length()>=5).forEach(n->System.out.print(n+" "));
	}
}