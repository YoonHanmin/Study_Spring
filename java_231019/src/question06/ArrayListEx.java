package question06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<String>();
	for (int i = 0; i < 4; i++) {
		System.out.print("이름을 입력하세요>>");
		list.add(i,scan.next());
	}
	for(String str : list) {
		System.out.print(str+" ");
	}
	int a = list.get(0).length();
	for (int i = 0; i < list.size(); i++) {
				if(a<list.get(i).length()) {
			a=list.get(i).length();
		}
	}
		
	for (int i = 0; i < list.size(); i++) {
		if(a==list.get(i).length()) {
			System.out.println("가장 긴 이름은 : "+ list.get(i));
		}
	}
}
	
}
