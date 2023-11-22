package chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요.");
		//System.in : 바이트 표준 입력 스트림.
		//System.in : 매개변수(인자,파라미터,argument)
		// scanner : 참조(reference)변수
		Scanner scanner = new Scanner(System.in); // 객체 생성, Scanner 객체를 생성하고, Scanner 클래스타입의 scanner 참조변수가 이 객체의 주소를 가르킨다.
		String name = scanner.nextLine(); // 문자열을 입력 받는 메소드.
		System.out.println("이름은 :" + name);
		String city = scanner.next();
		System.out.println("도시는 :" + city);
		int age = scanner.nextInt(); 
		System.out.println("나이는 :" + age + "살");
		double weight = scanner.nextDouble();
		System.out.println("체중은 :" + weight + "kg");
		boolean single  = scanner.nextBoolean();
		System.out.println("독신 여부는 :" + single + "입니다.");
		scanner.close(); // close() : scanner 객체종료(자원 반납) =>메모리를 더 사용할수있고, 안하면 garbage collector가 자동으로 처리.
		
	}
}
