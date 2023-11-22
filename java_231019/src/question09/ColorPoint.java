package question09;

class Point{
	private int x,y;

	public Point(int x, int y) {
		
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


public class ColorPoint extends Point {
	private String color;
public ColorPoint() {
		super(0,0);
		color = "black";
		
	}
public ColorPoint(int x,int y) {
	super(x,y);
	
}
public void setXY(int x,int y) {
	move(x,y);
}

public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return color+"색의 (" +getX()+","+getY()+ ")"+"의 점";
}


}
