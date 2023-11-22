package chapter05;

class Point{
	private int x,y; // 3번

	

	public void set(int x,int y) { // 2번 
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
	
	
}

class ColorPoint2 extends Point{
	private String color;

	public ColorPoint2(int x,int y,String color) {
		
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
	
}


public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
//		1번
		p.set(1,2);
		p.showPoint();
		
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
		cp.setColor("red");
		cp.showColorPoint();
		
	}
}
