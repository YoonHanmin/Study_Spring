package chapter02;

public class CircleArea {
	public static void main(String[] args) {
		double pi = 3.14;
		int radius=10;
		// int * double = double 결과는 큰 타입을 따라감 
		double circleArea = radius*radius*pi;
		float pi1 = 3.14f;
		short ra = 10;
		float a = pi1*ra*ra;
		System.out.println(circleArea);
	}
}
