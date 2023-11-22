package question06;

public class Trapezoid {
	int under,up,height;
	public Trapezoid(int under, int up, int height) {
		
		this.under = under;
		this.up = up;
		this.height = height;
	}

	public double getArea() {
		
		double area = (up+under)*height;
		return area/2;
	}
	
	
	public static void main(String[] args) {
		Trapezoid t = new Trapezoid(5,4,10);
		System.out.println("사다리꼴의 면적은 : "+ t.getArea());
	}
}
