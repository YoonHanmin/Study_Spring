package package1;

import java.util.Scanner;

public class AccountExam {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Scanner control = new Scanner(System.in);
	Account account = new Account();
	
	System.out.println("입력하세요. 입금/조회/출금");
	String order = control.next();
	
	switch(order) { 
	case "입금" :
	System.out.println("입금액을 입력하세요.");
	int money = scanner.nextInt();
	account.deposit(money);
			break;
			//잔액조회
	case "조회" :
	System.out.println("현재 잔액은 "+account.getBalance()+ "원");
			break;
	//출금하기
	case "출금" :

	while(true) {
		System.out.println("출금액을 입력하세요.");
		int outmoney = scanner.nextInt();
		try { account.withdraw(outmoney); 
				}
	
	catch(InsufficientException e) {
		String message = e.getMessage(); 
		System.out.println(message);
			continue;
			}
		break;	// while문 빠져나감
		}	
	break;
	}
	}
}


	


