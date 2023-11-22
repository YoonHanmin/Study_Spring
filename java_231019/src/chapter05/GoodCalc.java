package chapter05;

abstract class Calculator { // 추상 클래스지만 추상 메소드가 없다.
//	public int add(int a,int b) {
//		return 1;
//	}
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	public abstract double average(int[] a);

}

public class GoodCalc extends Calculator { // 추상메서드를 상속받아놓고 구현안하면 오류
//	public int add(int a,int b) {
//		return 1;
//	}
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc(); // 추상클래스는 객체를 생성할 수 없다.
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}
