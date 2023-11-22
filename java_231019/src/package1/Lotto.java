package package1;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
		public static void main(String[] args) {
			Random random = new Random();
			int[] lottoNum = new int[6]; // 0,1,2,3,4,5 빈 배열 생성  
			
			for(int i=0;i<6;i++) {
				int number = random.nextInt(45)+1; 
				
						for(int j=0;j<i;j++) {  
							
								if(lottoNum[j]==number) {
								System.out.println("중복");
								System.out.println(lottoNum[j]+"=="+number);
								number = random.nextInt(45)+1;
								j--;
									}	
					lottoNum[i]=number;
				}
				
				lottoNum[i]=number; 
			}
			
			
			for(int number : lottoNum) {
				System.out.print(number);
				System.out.print(",");
			}
		
		}
		
}
