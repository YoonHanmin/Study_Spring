package chapter02;

public class VariableExchangeExample {
public static void main(String[] args) {
		int x= 1;
		int y= 2;
		int z= 3;
		System.out.println("x:"+x+",y:"+y+",z:"+z);
		// x값을 임시저장
		int temp=x;
		x=y;
		y=z;
		z=temp;
		// 임시값을 y에 저장
		System.out.println("x:"+x+",y:"+y+",z:"+z);
	}
}
