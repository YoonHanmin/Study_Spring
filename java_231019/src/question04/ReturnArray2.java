package question04;

public class ReturnArray2 {
	public static int[] makeArray() {
	int[] temp = new int[10];
	for (int i = 0; i < temp.length; i++) {
		temp[i] = 1+i;
	}
	return temp;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr = makeArray();
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(100 + arr[i]+ " ");
		}
		}
	
}
