package test;

import java.util.ArrayList;

public class B1157 {
	public static void main(String[] args) {
		int max = 0;
		int num = 0;
		int same = 0;
		String s = "ABCC";
		char result;
		// 유니코드 A~z까지 배열 생성
		int[] alpabat = new int[58];
//		for (int i = 0; i < 58; i++) {
//			alpabat[i] = 0;
//		}
		// 문자열을 해당 알파벳 배열값에 누적 카운트 ex) A = 배열[0]= A-65
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i);
			alpabat[(int) (result - 65)] += 1;
		}
		for(int i = 32;i<58;i++) {
			alpabat[i-32] += alpabat[i];
		}
		// 카운트 최대값 = 가장 많은 알파벳
		for (int i = 0; i < 58; i++) {
			max = Math.max(max, alpabat[i]);
		}
		// 최대값가진 배열 번호 찾아서 문자로 변환
		for (int i = 0; i < 58; i++) {
			if (alpabat[i] == max) {
				num = i;
			}
		}
		
		for(int i = 0; i < 32; i++) {
			for(int j = 1; j < 32; j++) {
				if((alpabat[i]!=0)&&(alpabat[i]==alpabat[j])) {
					same++;
//					System.out.println("same = "+same);
//					System.out.println(alpabat[j]);
				}
			}
		}
//				for (int i = 0; i < 58; i++) {
//					System.out.println(i + " = " + alpabat[i]);
//				}
								
	
		
	
		
		
//		배열값 확인
		
		
		
		result = (char) ((char) num + 65);
		for(int i=0;i<32;i++) {
		if(max>0) {
			result = '?';
		}
		}
		System.out.println(result);	
		
	}

}
