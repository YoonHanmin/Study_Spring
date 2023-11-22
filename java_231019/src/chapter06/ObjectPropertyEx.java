package chapter06;

class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void printa() {
		System.out.println(x+y);
	}
}


public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass()); //실행중인 클래스가 나온다. -> up캐스팅
		System.out.println(obj.hashCode()); //객체의 서명(10진수 해시코드)
		System.out.println(obj.toString()); // 패키지.클래스@16진수 해시코드
	}
	public static void main(String[] args) {
	Point p	= new Point(2,3);
	print(p);
	
	
	
	
	}
	
}
