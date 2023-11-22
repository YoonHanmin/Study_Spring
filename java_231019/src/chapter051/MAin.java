package chapter051;

public class MAin {
	public static void main(String[] args) {
	Animal a; // 추상클래스는 객체생성은 못해도 참조변수 선언은 가능
	Penguin p =new Penguin();
	p.swim();
	
	Bird p2 = new Penguin(); // upcasting
//	p2.swim(); 업캐스팅은 슈퍼클래스의 멤버만 접근 가능하다.
	Penguin p3 =(Penguin)p2; // downCasting
	p3.swim(); // 다운캐스팅은 서브클래스 멤버 접근 가능
	
	Bird d =new Duck(); // upCasting
	d.eat();
	Duck d2 = (Duck) d;
	
	Animal d3 = new Duck(); // 추상클래스를 참조변수로 선언하고 업캐스팅
	int x = d3.life;
	System.out.println(x);
	
//	new Swim(); //인터페이스도 객체 생성 못한다.
	Swim s = new Penguin(); //인터페이스를 참조변수로 선언할수 있다.
	s.swim(); // swim을 구현해낸 Penguin 객체를 생성했기떄문에 사용 가능.
	
	Swim[] s2 = new Swim[2]; // s2가 인터페이스 배열 2개를 가리킨다.
//	s2[0] , s2[1] 은 인터페이스 swim의 참조변수 역할
	s2[0] = new Penguin();
	s2[1] = new Duck();
	s2[0].swim();
	Penguin p5 = new Penguin();
	p5.swim();
	
	
}
	
}
