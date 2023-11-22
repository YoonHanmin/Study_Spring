package question09;

public class ColorPointTwo extends ColorPoint {

	public ColorPointTwo() {
		this(0,0);
		
	}
	public ColorPointTwo(int x,int y) {
		super(x,y);
		setColor("Black"); 
		
	}
	
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString());
		ColorPointTwo cp = new ColorPointTwo(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
		
		
	}

}
