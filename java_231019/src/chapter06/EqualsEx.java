package chapter06;

class Point3{
	private int x,y;
	public Point3(int x,int y) {
		this.x = x;
		this.y = y;
	}
//	toString 메소드를 해시코드가 나오는것이 아닌 객체 값을 비교할수있게 오버라이딩하여 사용한다.
	public boolean toString(Object obj) {
		Point3 p = (Point3)obj;
		if(x==p.x&&y==p.y) {
			return true;
	} else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(3, 3);
		Point3 b = new Point3(3, 3);
		Point3 c = new Point3(3, 4);
		
		if(a==b) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b"); }
		
			if(a.toString(b)) {
				System.out.println("a is equal to b");
				
			}else {
				System.out.println("a is not equal to b");
			
		}
		
	}
}
