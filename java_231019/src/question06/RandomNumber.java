package question06;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
//		Math 클래스 메소드를 직접 쓰는 방법
//	int r;
//	while(true) {
//	r = (int) (Math.random()*10)+1;
//	if(r==7) {
//		System.out.println(r);
//		break;
//	}else
//	System.out.println(r);
//	}
		
//	Random 객체를 통해 사용
	int rNumber = 1;
	Random generator = new Random();
//	generator.nextInt(); // 난수 발생(범위 : int범위)
//	generator.nextInt(10); // 난수 발생(범위 :0~9)
//	generator.nextInt(10)+1; // 난수 발생(범위 :1~10)
//	generator.nextInt(10)*(-1); // 난수 발생(범위 :-9~0)
	
	while(rNumber!=7) {
	rNumber = generator.nextInt(10)+1;
	System.out.println(rNumber);
	}
	
	
	
}
}