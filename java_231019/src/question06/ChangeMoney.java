package question06;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		Scanner scan = new Scanner(System.in);
		int rs = 0;
		System.out.print("금액을 입력하시오>>");
		int money = scan.nextInt();
		
		
		
		
		for (int i = 0; i < unit.length; i++) {
			rs = money/unit[i];
			
			if(rs!=0) {System.out.println(unit[i]+"원 짜리 : "+rs+"개");
			money -= rs*unit[i];
			}
			}
		
	}
}
