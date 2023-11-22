package question06;

class ArrayUtil{
	public static int[] concat(int[] a,int[] b) {
		int n = a.length+b.length;
		int[] arr= new int[n];
		int x = 0;
		for (int i = 0; i < n; i++) {
			if(i<a.length) {
				arr[i] = a[i];
			}else { arr[i] = b[x];
			x++;
			
			}
		}

		return arr;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
	
	
	
}



public class StaticEx {
	public static void main(String[] args) {
		int[] arr1 = {1,5,7,9};
		int[] arr2 = {3,6,-1,100,77};
		int[] arr3 = ArrayUtil.concat(arr1,arr2);
		ArrayUtil.print(arr3);	
	}
}
