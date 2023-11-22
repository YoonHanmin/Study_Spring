package package2;

import java.util.Scanner;

import package1.InsufficientException;

public class BankApplication {
	
	public static void first() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.생성/2.목록/3.예금/4.출금/5.이체/6.종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택>");
		}
	public static void main(String[] args) {
		
		Account[] account = new Account[100];
		Scanner scanner = new Scanner(System.in);
		int i=0;
	
		
		Lable: while(true) {
		first();		
		int order = scanner.nextInt();
		
		switch(order) {
		case 1 : //생성
			
			System.out.println("계좌 생성");
			System.out.print("계좌 번호");
			String acc = scanner.next();
			System.out.print("계좌명");
			String name = scanner.next();
			account[i] = new Account(acc,name,i);
			i++;
			System.out.println("결과: 계좌가 생성되었습니다.");
			
			
			
				break;
		case 2 : //조회
			try{System.out.println("계좌목록");
			for(int n=0;n<account.length;n++) {
				System.out.println(account[n].getAcc()+"-"+account[n].getName());
			}break;}
			catch(NullPointerException e) {
				e.getMessage();
				break;
			}
		case 3 : //입금
			System.out.println("예금 입금");
			System.out.println("계좌번호를 입력하세요 ex)111-111");
			name = scanner.next();
			try{
				for(int j=0;j<account.length;j++) {
			
			if(name.equals(account[j].getAcc())){
				int searhId = account[j].getId(); 
				System.out.println("계좌명 : " +account[searhId].getName() +" 입금액을 입력하세요.");
				int money = scanner.nextInt();
				account[searhId].deposit(money);
				System.out.println("입금완료. 잔액 : "+ account[searhId].getBalance());}
			
					}
				}
				catch(NullPointerException o) {
					o.getMessage();
					break;}
					break;
		case 4 : //출금
			System.out.println("출금");
			System.out.println("계좌번호를 입력하세요 ex)111-111");
			name = scanner.next();
			try {
			for(int j=0;j<account.length;j++) {
			if(name.equals(account[j].getAcc())){
				int searhId = account[j].getId();
				System.out.println("계좌명 : " +account[searhId].getName()+ " 출금액을 입력하세요.");
				int money = scanner.nextInt();
				
				try{account[searhId].withdraw(money);
				
				System.out.println("출금완료. 잔액 : "+ account[searhId].getBalance());
				}
			catch(OverException o) {
				String message = o.getMessage(); 
				System.out.println(message);
					continue;
			}
			}}
			}
			catch(NullPointerException a) {a.getMessage();
			break;}
			break;
//		case 5 : //이체
//			System.out.println("이체");
//			System.out.println("본인 계좌번호를 입력하세요 ex)111-111");
//			name = scanner.next();
//			for(int k=0;k<account.length;k++) {
//				if(name.equals(account[k].getAcc())){
//					int searhId = account[k].getId();
//					System.out.println("계좌명 : " +account[searhId].getName()+ " 이체할 계좌번호를 입력하세요.");
//					name = scanner.next();
//			for(int j=0;j<account.length;j++) {
//				if(name.equals(account[j].getAcc())){
//					int searhId2 = account[j].getId();
//					System.out.println("계좌명 : " +account[searhId2].getName()+ " 이체할 금액을 입력하세요.");
//					int money = scanner.nextInt();
//					account[k].transfer(money, account[j]);
//				}
//				}
//				} 
//			}
//			break;
		case 6 : 
			System.out.println("종료");
			break Lable;
		}
		
		}
		
	
	
	}
}
	


