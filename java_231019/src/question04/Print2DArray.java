package question04;

public class Print2DArray {
	public static void main(String[] args) {
		int n[][] = { {1},{1,2,3},{1},{1,2,3,4},{1,2}};
		for (int i = 0; i < n.length; i++) {
			for(int j=0;j<n[i].length;j++) {
//				n[0].length = 1;
//				n[1].length = 3;
			System.out.print(n[i][j]);
		}System.out.println();
		
	}
	}
}

