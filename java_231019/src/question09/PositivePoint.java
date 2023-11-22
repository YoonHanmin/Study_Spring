package question09;
class Point3{
	private int x,y;

public Point3() {
		
		this.x = 0;
		this.y = 0;
	}
	public Point3(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	protected void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
	
	
}
public class PositivePoint extends Point3 {
//	부모 생성자 super을 상위에 놓고 그밑에 조건문을 달면 조건문도 실행된다.
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0||y<0) {
			super.move(0, 0);
		}
		
	}

	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if(x>0&&y>0){
			super.move(x, y);}
		else {
			return;}
	}
		
	public PositivePoint() {
		super();
	}
	

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString());
		p.move(-5, 5);
		System.out.println(p.toString());
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString());
		
	}
	
	
	
	
	
	
}
