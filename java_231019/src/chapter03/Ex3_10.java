package chapter03;
/*
 * 4년 전체 평점의 평균 구하기
 * 2차원 배열을 이용해서 원소로 초기화
 * 1행 1열~4행2열까지
 */


public class Ex3_10 {
	public static void main(String[] args) {
		double sum=0;
		double score[][] = {{3.3,3.4} // 1행 1열,2열
							,{3.5,3.6} // 2행 1열,2열
							,{3.6,4.0}
							,{4.1,4.2}
							};
		// score.length = 4(행의 크기)
		for (int i = 0; i < score.length; i++) {
//			socre[i].length = 2(열의 크기)
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j]; // (0,0) ~ (3,1)까지 배열 원소를 sum에 누적
			} // 반복이 끝나면 8개 학기의 평점 합계가 누적됨.
		} 
		int n = score.length; // 4(행의 크기)
		int m = score[0].length; // 2(열의 크기)
		System.out.println("4년 전체 평점은 : "+ sum/(n*m));
		
		}
		
	}

