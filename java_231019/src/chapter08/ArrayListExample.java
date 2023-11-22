package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
//	List 인터페이스 타입에 String 타입을 가진 list로 upcasting	하여 객체 생성
	List<String> list = new ArrayList<String>();
	list.add("Java");
	list.add("JDBC");
	list.add("Servlet/JSP");
	list.add(2,"Database"); // 2번째 인덱스였던 Servlet/Jsp가 3번으로 밀려남
	list.add("Spring");
	
	int size = list.size();
	System.out.println("총 list 갯수 : "+size); //총 list 갯수 : 5
	
	String skill = list.get(2);
	System.out.println("2번째 인덱스 : "+ skill);
	System.out.println("3번째 인덱스 : "+ list.get(3)); 
	
	list.remove("Spring");
	for (int i = 0; i < list.size(); i++) {
		
		System.out.println("index"+i+": "+list.get(i));
		
	}
	
	}
	
}

