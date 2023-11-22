package question01;

public class check {
	public static void main(String[] args) {
		for(int i=100;i<999;i++) {
			
		int number = i;
		int first = number/100;
		int second = (number-(first*100))/10;
		int third = number-(100*first)-(10*second);
		System.out.println("수 :"+ i);
		System.out.println("100의 자리와 10의 자리의 합은" + (first + second));
		System.out.println("10의 자리와 1의 자리의 곱은 "+ (second*third));
	}
	}
}

