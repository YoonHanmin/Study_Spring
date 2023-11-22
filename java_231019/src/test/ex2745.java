package test;

public class ex2745 {
	public static void main(String[] args) {
		
		
		long result = 0;
		int num = 0;
		int idx = 0;
		int a=36;
		String s = "ZZZZZ";
					for(int i=s.length()-1;i>=0;i--) {
			char A = s.charAt(i);
			if(0<=A&&A<=9) {
				num = A - '0'; // '0'은 정수형 48, char 숫자 - '0'은 정수 0이 나옴
			} else {
				num = A-55;
			
			result += num*Math.pow(a,idx++);
			}
		}
			System.out.println(result);
			
	
	}
}
