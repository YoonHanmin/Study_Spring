package question03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String s = scanner.next();
			if(s.equals("exit")) {
				System.out.println("종료합니다..");
				scanner.close();
				break;
			}
		}
	}
	
}
