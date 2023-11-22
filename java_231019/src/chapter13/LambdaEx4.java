package chapter13;


interface MyFunction4{
	int calc(int x,int y);
}


public class LambdaEx4 {
	public static void main(String[] args) {
		printMultiply(3, 4, (x,y)->x*y); //파라미터가 함수형인터페이스 참조변수인데, 람다식을 매개변수로 전달 가ㄷ능
 	}
//	메소드 매개변수로 인터페이스 객체를 받음
//	f로 (x,y) ->x*y 람다식을 전달 받음 
	static void printMultiply(int x,int y,MyFunction4 f) {
		System.out.println(f.calc(x,y));
	}
	
}
