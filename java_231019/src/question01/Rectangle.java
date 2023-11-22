package question01;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점(x,y)의 좌표를 입력하시오>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		// (100,100),(200,200) 좌표 범위
		if (((100 <= x) && (x <= 200)) && ((100 <= y) && (y <= 200))) {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");

		} else {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
			scanner.close();
		}

	}

}
