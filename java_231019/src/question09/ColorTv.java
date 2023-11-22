package question09;

class TV{
	private static int size;
	
	public TV(int size) {
		this.size = size;
	}

	protected static int getSize() {
		return size;
	}
	
}


public class ColorTv extends TV {
	private static int color;
public ColorTv(int size,int color) {
	super(size);
		this.color = color;
	}
protected static int getColor() {
	return color;
}

	public void printProperty() {
		System.out.println(super.getSize()+"인치 "+color+" 컬러");
	}
public static void main(String[] args) {
	ColorTv myTV = new ColorTv(32,1024);
	myTV.printProperty();
	
}
}
