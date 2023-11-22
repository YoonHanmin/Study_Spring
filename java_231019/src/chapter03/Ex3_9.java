package chapter03;
/*
 * 구구단을 배열로 생성
 * 값을 넣어본다 ex> 2*7=14
 */

public class Ex3_9 {

	public static void main(String[] args) {
//		1차원은 열로 구성, 1차원을 2개이상 가지고 행으로 구성
		
		int[][] gugudan = new int[10][10]; //index는 0~9까지
		for (int i = 1; i <=9; i++) {  // 행 기준
			for (int j = 1; j <=9; j++) { // 열 기준
				gugudan[i][j] = i*j;
			}
		}
	System.out.println("2X7 = " +gugudan[2][7]);
	System.out.println("9X4 = " +gugudan[9][4]);
		
		
	}

}
