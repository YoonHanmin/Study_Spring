package question06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		String fname,lname;
		Scanner scan = new Scanner(System.in);
//		List<Person> list = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			Person name = new Person("yoon","gidong");
//			list.add(name);
//			System.out.println(list.get(i).getFirstName());
//		}
		
		System.out.print("성을 입력하세요 : ");
		lname = scan.next();
		System.out.print("이름을 입력하세요 : ");
		fname = scan.next();
		Person person1 = new Person(lname,fname);
		System.out.println("성: "+person1.lastName+"이름 : "+person1.firstName+"성명의 길이 : "+person1.getLength());
		System.out.print("성을 입력하세요 : ");
		lname = scan.next();
		System.out.print("이름을 입력하세요 : ");
		fname = scan.next();
		Person person2 = new Person(lname,fname);
		System.out.println("성: "+person2.lastName+"이름 : "+person2.firstName+" 성명의 길이 : "+person2.getLength());
		
		scan.close();
	}
}

