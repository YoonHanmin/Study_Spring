package test;

public class b2444 {
	public static void main(String[] args) {
		int N = 5;
		for (int i=0;i<N;i++) {
			for(int j=0;j<N-i;j++) 
				System.out.print(" ");
			
			for(int j=0;j<i*2-1;i++) 
				System.out.print("*");
			System.out.println();
		}
		}
	}

	
			
		
		
	

//for(int i = 1; i <= N ; i++) {
//	for(int j = 0; j < N-i; j++)
//		System.out.print(" ");
//	for(int j = 0; j < i*2-1; j++)
//		System.out.print("*");
//	System.out.println();
//}
//
//for(int i = N-1; i >= 0 ; i--) {
//	for(int j = 0; j < N-i; j++)
//		System.out.print(" ");
//	for(int j = 0; j < i*2-1; j++)
//		System.out.print("*");
//	System.out.println();