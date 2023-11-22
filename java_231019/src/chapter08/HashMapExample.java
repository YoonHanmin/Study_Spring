package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
//		Map 인터페이스 타입으로 HashMap 클래스 객체 Upcasting 생성(키:문자열,값:정수형 Wrapper 클래스)
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이찬원", 25);
//		map.put("임영웅", 30); // key값은 중복이 안되고, 값은 중복 허용되므로 값을 덮어 썼다.
		map.put("김호중", 30);
		map.put("정동원", 14);
		
		System.out.println("총 Entry수 : "+map.size());
		System.out.println("임영웅:"+map.get("임영웅"));
		System.out.println();
//		for(String string:keySet) {
//			System.out.println(string);
//		}
		
//		Map 컬렉션 키/값을 가져오는 1번째 방법 : key값만 가져와서 얻은 key값을 Set에 넣고, Iterator을 돌려서 map.get 메소드를 통해 value를 가져온다.  
		Set<String> keySet = map.keySet(); //모든 key를 Set 객체에 담아서 리턴
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":"+ value); // 출력 순서는 무작위로 나온다.
		}
		System.out.println();
		
		System.out.println("총 Entry 수:"+map.size()); // Map.Entry 구조로 키/값으로 구성
		map.remove("임영웅"); // key를 삭제하면 Map.Entry 하나가 통으로 사라진다.
		System.out.println("총 Entry 수:"+map.size()); // Map.Entry 구조로 키/값으로 구성
		
		
//	    Map 컬렉션 키/값을 가져오는 2번째 방법 : Map.entry 객체를 사용 = key와 value값이 묶여진 객체기때문에 한번에 수정,꺼내기 가능
		// Map.Entry 구조의 키/값으로 구성된 Set 객체 entrySet를 생성.	
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// Set 컬렉션 방식으로 Iterator 객체를 통하여 entrySet 이라는 객체를 꺼내옴
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) { // 객체가 있으면 참
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey(); // Map의 
			Integer value = entry.getValue();
			System.out.println(key +" "+ value);
			
		}
	
	}
}
