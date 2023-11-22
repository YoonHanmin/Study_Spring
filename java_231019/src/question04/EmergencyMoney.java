package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dollor = 1200;
		int num = 0;
			int res;
		int hund = 0;
		int ten = 0;
		System.out.print("가구수를 입력하시오>>");
		num = scan.nextInt();
		int money=400000+(num-1)*200000;
		hund = (money/dollor)/100;
		ten = ((money/dollor)%100)/10;
		
		if(num==1) {
			hund = (money/dollor)/100;
			ten = ((money/dollor)%100)/10;
		}
		
		if(num==2) {
			hund = (money/dollor)/100;
			ten = ((money/dollor)%100)/10;
		}
		
		if(num==3) {
			hund = (money/dollor)/100;
			ten = ((money/dollor)%100)/10;
		}
		if(num==4) {
			hund = (money/dollor)/100;
			ten = ((money/dollor)%100)/10;
		}
		if(ten>0) {	
		    System.out.println("100달러 짜리"+hund+"매");
			System.out.println("10달러 짜리"+ten+"매");
			} else{
		System.out.println("100달러 짜리"+hund+"매");
}
}
}