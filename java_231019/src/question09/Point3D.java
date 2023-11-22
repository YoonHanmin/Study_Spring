package question09;
class Point2{
	private int x,y;

	public Point2(int x, int y) {
		
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
	
}
public class Point3D extends Point2{
	private int z;
	
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	
	public Point3D(int x, int y,int z) {
		super(x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "(" + getX() +","+getY()+","+getZ()+")"+"의 점";
	}
	public void move(int x,int y,int z) {
		move(x,y);
		setZ(z);
	}
	
	public void moveUp() {
		this.z +=1;
	}
	public void moveDown() {
		this.z -=1;
	}
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString());
		p.moveUp();
		System.out.println(p.toString());
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString());
		p.move(100, 200, 300);
		System.out.println(p.toString());
		
		
		
	}
	
	
	
	
	

}
