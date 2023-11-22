package chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		a= a+3;
		b *= 3; // b=b*3
		c%=2; // c=c%2 ( 2로 나눈 나머지)
		System.out.println("a="+a+",b="+b+",c:"+c);
		int d=3; // a=6,d=3
		System.out.println("a="+a+",d="+d);
		a=d++; // a=3, d=4 d를 먼저 a에 넘기고, 1을 증가
		System.out.println("a="+a+",d="+d);
		a=++d; // a=5,d=5 d를 1 증가시키고 a로 넘김. 
		System.out.println("a="+a+",d="+d);
		a=d--; // a=5,d=4 d를 먼저 a 넘기고 1 감소
		System.out.println("a="+a+",d="+d);
		a=--d; // a=3,d=3 d를 1 감소시키고 a로 넘김
		System.out.println("a="+a+",d="+d);
		
	}
}
