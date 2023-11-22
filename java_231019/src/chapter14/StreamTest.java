package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

public class StreamTest {
	public static void main(String[] args) {
//		new ArrayList<new Product()>();
//		upcasting으로 타입 파라미터가 Product인 ArrayList 객체 생성
    List<Product> list = new ArrayList<Product>();
//    Product 객체들을 담는 배열 list에 add메소드를 통해 파라미터에 product 객체를 생성하며 생성과 동시에 담는다.
		list.add(new Product(1,"NoteBook",100));
		list.add(new Product(2,"TV",320));
		list.add(new Product(3,"Washing Machine",250));
		list.add(new Product(4,"Air Conditioner",500));
		
		List<String> result = list.stream() // 스트림 생성
			.filter(p -> p.price>300) // 가격이 300을 초과한 객체 p를 추출
			.map(p->p.name) // 필터링된 객체의 name변수를 추출 
			.collect(Collectors.toList());
		System.out.println(result);
	}
}
