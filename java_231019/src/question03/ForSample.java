package question03;

public class ForSample {
	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			sum += i;
			if (i < 10) {
				System.out.print("+");
			} else if (i == 10) {
				System.out.print("=");
			}
		}
		System.out.println(sum);

	}
}
