package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		
		System.out.println("주사위 눈"+ rollDie());
	}

	public static int rollDie() {
		double x = 6*Math.random();
		int temp = (int)x;
		return temp+1;
	}
}

