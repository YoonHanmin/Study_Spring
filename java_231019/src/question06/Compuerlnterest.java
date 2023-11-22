package question06;

import java.util.Scanner;

public class Compuerlnterest {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int principal,years;
	double rate,balance;
	
	 years= 0;
	 System.out.print("원금을 입력하세요");
	 principal = scan.nextInt();
	 System.out.print("연이율을 입력하세요");
	 rate=scan.nextDouble();
	 balance = principal;
	 System.out.println("연도수 : "+years+"원리금 :"+balance);	 
	 while(balance<=principal*2) {
		 balance = balance*(1.0+rate/100.0);
	 years +=1;
	 System.out.print("연도수 : "+years+"원리금 :");
	 System.out.printf("%,9f",balance);
	 System.out.println();
	}
}
}
