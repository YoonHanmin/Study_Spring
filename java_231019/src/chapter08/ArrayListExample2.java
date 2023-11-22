package chapter08;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
//		ArrayList의 add메소드의 타입은 boolean이다.
		boolean aaa =array.add("oracle");
		System.out.println(aaa);
		boolean bbb =array.add("mysql");
		System.out.println(bbb);
//		중복값도 저장 가능
		boolean ccc =array.add("oracle");
		System.out.println(ccc);
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i +":"+str);
			
		}
	}
}
