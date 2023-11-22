package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pur = 0;
		int balance = 0;
		int sum = 0;
		System.out.print("구매금액을 입력하세요 :");
		pur = scanner.nextInt();
		if(pur>=300000) {
			balance = pur-30000;
		} else if(pur>=100000) {
			balance = pur-5000;
			}else {
				balance = pur;
				}
		System.out.println("구매 금액 : "+pur);
		System.out.println("청구 금액 : "+ balance);
	
		
	}
}
