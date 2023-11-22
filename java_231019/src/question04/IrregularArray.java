package question04;

public class IrregularArray {
	public static void main(String[] args) {
//		int arr[][] = {{10,11,12},
//				{20,21},
//				{30,31,32},
//				{40,41}};
//		비정방 배열 생성 : 행만 정의하고 열은 비워둠
		int arr[][]=new int[4][];
		arr[0] = new int[3]; // 1행 n[0]의 열의 크기는 3
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		
		
		
//		4번 반복
		for (int i = 0; i < arr.length; i++) {
//			3,2,3,2 반복
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1)*10+j;
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}System.out.println();
		}
		
		}
	}

