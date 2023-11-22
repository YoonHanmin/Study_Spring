package chapter04;

public class Circle2 {
	int radius;
	String name;
	public  double getArea() {
		return 3.14*radius*radius;
	}
	public Circle2() {
		radius=1;
		name="";
	}
//	매개변수와 멤버변수가 같을때 this를 통해 구분해준다.
//	public Circle2(int radius) {
//		this.radius = radius;
//	}
	public Circle2(int radius,String name) {
		this.name = name;
		this.radius = radius;	
	}
	
	
	public static void main(String[] args) {
//		객체 레퍼런스 변수 선언
//		객체 생성시 자동으로 생성자 호출
//		Ctrl+마우스 클릭 = 해당 변수 원 위치로 이동
		Circle2 pizza = new Circle2(10,"자바피자");
		
		pizza.getArea();
		double area = pizza.getArea();
		System.out.println(area);
		
		Circle2 donut = new Circle2();
		donut.name="자바도넛";
		
		Circle2 pizza2 =new Circle2(10,"피자");
		System.out.println(pizza2.name);
		
		Circle2 pizza3 =new Circle2(10,"피자");
		System.out.println(pizza2.name);
		
		Circle2 pizza4 =new Circle2(10,"피자");
		System.out.println(pizza2.name);
		
		pizza3.radius = 15;
		
	}
	
	
}
