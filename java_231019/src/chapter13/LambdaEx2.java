package chapter13;

interface MyFunction2{
	int cals(int x);
}



public class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction2 square = x-> x*x; 
		System.out.println(square.cals(3));
	}
}
