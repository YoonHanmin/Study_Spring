package question01;

import java.util.Scanner;

public class ExRectangle {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("가로,세로 길이를 입력하세요>>");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			int rectangle = width*height;
			System.out.println("사각형의 면적은 "+ rectangle + "입니다.");
			scanner.close();
			}
		}

