package question09;

public class Circles implements Shapes{
	int radius;
	
	public Circles(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("도형을 그립니다.");
		
	}

	@Override
	public double getArea() {
		
		return PI*radius*radius;
	}
	
	public static void main(String[] args) {
		
		Shapes donut = new Circles(10);
		donut.redraw();
		System.out.println("면적은 "+ donut.getArea());
	}
	

}
