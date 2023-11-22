package question04;

public class IrregularArray2 {
	public static void main(String[] args) {
		int[][] arr = new int[5][];
		int[] arr2 = {5,1,4,2,3};
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2[i]; j++) {
				arr[i] = new int[arr2[i]];
				arr[i][j] = 35+(10*i)+j;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
