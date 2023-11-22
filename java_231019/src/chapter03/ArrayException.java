package chapter03;
/*
 * 예외처리
 * 배열 인덱스 벗어나는 것
 */


public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=0;
		
		
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//		at chapter03.ArrayException.main(ArrayException.java:15)
		
		
		
		
//		예외가 발생할수 있기에 예외처리
		try {	
			for (int i = 0; i < 5; i++) {
//				[1]=1  0+1+0
//				[2]=3  1+1+1
//				[3]=6  2+1+3
//				[4]=10 3+1+6
//				[5]=15 4+1+10
				intArray[i+1] = intArray[i]+i+1;
				
				
				System.out.println(intArray[i]);
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				
//		Exception은 모든 예외의 조상이기 때문에 예외종류 상관없이 다 처리가능(실무에서 많이 사용)
//		} catch (Exception e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
//		}
	}
}
}
