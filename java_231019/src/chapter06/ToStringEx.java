package chapter06;

class Point2{
	private int x,y;
	public Point2(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
//	toString 메소드를 해시코드가 나오는것이 아닌 객체 값을 나올수있게 오버라이딩하여 사용한다.
	public String toString() {
		return "Point2("+x+","+y+")";
	}


}



public class ToStringEx {
	public static void main(String[] args) {
		
	
	Point2 p = new Point2(2, 3);
	System.out.println(p);
	p.toString();
	System.out.println(p.toString()+"입니다.");
	
	
	
	}
}
