package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java","Stream","Library");
		System.out.println(words);
		List<Integer> result = words.stream() // 스트림 생성
		.map(String::length) // map메소드를 통해  메소드 참조로 문자열 길이를 구함. 이후 다시 List로 받아야함.
		.collect(Collectors.toList()); // collect 메소드로 List 타입으로 변환한뒤, toList 메소드를 통해 list로 변환
		System.out.println(result);
	}
}
