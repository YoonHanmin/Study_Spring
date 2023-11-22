package chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
	
	
	
	
	public static void main(String[] args) {
//		new 연산자로 Rectangle 객체를 생성하면서, Rectangle 클래스타입의 참조변수 rect가 가리킴
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
//		객체로 접근해서 스캐너에서 입력받은 정수가 셋팅
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 "+ rect.width*rect.height);
	
	}
}
