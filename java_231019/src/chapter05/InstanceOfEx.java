package chapter05;

/*
 * instanceof 연산자 사용(상속)
 */


class Person{
	
}

class Student extends Person{
	
}
class Researcher extends Person{
	
}
class Professor extends Researcher{
	
}


public class InstanceOfEx {
	static void print(Person p) {
		// Person p = new Student() -> upCasting
		if(p instanceof Person) { // p객체가 Person 클래스타입인가?
			System.out.print("Person"); // 참이면 출력
		}
		if(p instanceof Student) { // p객체가  Student 클래스타입인가?
			System.out.print("Student"); // 참이면 출력
		}
		if(p instanceof Researcher) { // p객체가  Researcher 클래스타입인가?
			System.out.print("Researcher"); // 참이면 출력
		}
		if(p instanceof Professor) { // p객체가  Professor 클래스타입인가?
			System.out.print("Professor"); // 참이면 출력
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
//		Student 객체를 생성해서 파라미터로 넘겨준다.
		System.out.print("new Student() ->\t"); print(new Student());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
		
		
	}
}
