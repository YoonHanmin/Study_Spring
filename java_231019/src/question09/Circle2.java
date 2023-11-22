package question09;

class Oval implements Shapes{
	double r1,r2;
	public Oval(double r1, double r2) {
		
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void draw() {
		System.out.println(r1+"x"+r2+"에 내접하는 타원입니다.");
		
	}

	@Override
	public double getArea() {
		
		return (r1/2*r2/2)*PI;
	}
	
}
class Rect implements Shapes{
	double width,height;
	public Rect(double width, double height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
	
		return width*height;
	}
	
}




public class Circle2 implements Shapes {
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
		
	}

	@Override
	public double getArea() {
		
		return PI*radius*radius;
	}
	
	public static void main(String[] args) {
		Shapes [] list = new Shapes[3];
		list[0] = new Circle2(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}

}
