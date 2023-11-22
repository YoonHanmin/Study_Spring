package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{
	
}


public class HashSetExample {
	public static void main(String[] args) {
//		Set 인터페이스 컬렉션 타입으로 HashSet클래스 객체를 upcasting
		Set<String> set = new HashSet<String>();
//		Set<Object> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복된 값은 넣을 수 없다.
		set.add("iBatis");
		
//		AA a = new AA();
//		set.add(a); //제네릭 타입을 Object로 하면 객체도, String도 저장 가능
		int size = set.size();
		System.out.println("총 객체수 : "+size);
//		set컬렉션은 iterator 메소드를 호출해서 iterator 인터페이스 타입으로 값을 받음.
		Iterator<String> iterator = set.iterator();		
		while(iterator.hasNext()) { //iterator 객체 값이 있으면
			String element = iterator.next(); // iterator메소드를 통해 set 다음 값을 순차적으로 element에 담는다. 
			System.out.println("\t"+element);
		}
		set.remove("JDBC");
		
		for(String string : set) { //foreach문으로 컬렉션에서 객체를 가져옴 
			System.out.println(string);
		}
		set.clear();
		if(set.isEmpty()) { // 객체가 하나라도 있는지 확인
			System.out.println("비어있음");
		} else {
			System.out.println("객체있음");
		}
		
	}
}
