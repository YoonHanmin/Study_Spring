package chapter04;

public class Circle {
	int radius; // Circle 클래스의 필드멤버
	public String name;
	public Circle() { //클래스의 생성자는 클래스이름과 같아야한다.
	}
	public Circle(int a) {} // 매개변수를 받는 생성자. 같은 이름,다른메소드로 일종의 오버로딩이다.
	public Circle(int a,int b) {} // 매개변수를 2개 받는 생성자. 같은 이름,다른메소드로 일종의 오버로딩이다.
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; // 참조 변수 선언. Circle 클래스의 객체명만 생성함.
		pizza = new Circle(); // 멤버가 3개인 객체(인스턴스) 생성
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(area);
		
		Circle donut = new Circle();
		
	}
}
