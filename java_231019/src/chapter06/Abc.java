package chapter06;

public class Abc {
	int a,b;

	public Abc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		Abc x = new Abc(1,2);
		Abc y = new Abc(1,2);
		
		
		System.out.println(x.equals(y));
		System.out.println(x==y);
	}
	

}
