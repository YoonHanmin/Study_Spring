package question02;

import java.util.Scanner;

public class ExGlobalStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double tax = 0;
		System.out.print("매수금액을 입력하세요: ");
		int buy=scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int sell=scanner.nextInt();
		if(sell>buy) { 	System.out.println("양도세 =" + (sell-buy)*0.22);
		} else {
			System.out.println("양도세 =" + tax);
						}
	}

}
