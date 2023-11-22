package package1;

public class Account {
		private long balance;
		public Account() {}
		public long getBalance() {
			return balance;
			}
		public void deposit(int money) {
		
			balance += money;
			System.out.println(money +"원이 입금되었습니다."+ "잔액 : " + balance);
		}
		
		public void withdraw(int money) throws InsufficientException {
			if(balance<money) {
				throw new InsufficientException("잔고부족, 현재 잔액 : "+ (balance));
			}
			balance -= money;
			System.out.println("인출 완료. 잔액 : " + balance);
		}
}

