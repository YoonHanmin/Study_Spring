package question09;

import java.util.Scanner;



class Add extends Calc{

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
class Sub extends Calc{

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
class Mul extends Calc{

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
class Div extends Calc{

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		// TODO Auto-generated method stub
		
	}

	@Override
	int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();
		Calc exp = null; // 추상클래스를 이용해서 간단하게 코드를 줄일 수 있다.
		switch (s) {
		case "+":exp = new Add();break;
		case "-":exp = new Sub();break;
		case "*":exp = new Mul();break;
		case "/":exp = new Div();break;

		default:
			break;
		}
		exp.setValue(a, b);
		if (exp instanceof Div && b==0) {
			System.out.println("계산 할 수 없습니다.");
		} else {
			System.out.println(exp.calculate(a, b));
		}
		
		scan.close();
	}
}
