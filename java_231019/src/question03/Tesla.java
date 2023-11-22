package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = 0;
		int tesla = 520;
		System.out.print("매수수량을 입력하시오>>");
		amount = scanner.nextInt();
		int money= tesla*amount;
		
		int res = money/100;
		if(res>0) {
			System.out.println("100달러짜리"+res+"매");
		}
		// 나머지 돈을 다시 세팅
		money = money%100;
		res = money/10;
		if(res>0) {
			System.out.println("10달러짜리"+res+"매");
			
		}
	}
}
