package package2;

public class Account {
	public Account(String acc,String name,int id) {
		setAcc(acc);
		setName(name); 
		setId(id);
	}
	public Account( ) {}
	private int id;
	private String acc;	
	private String name;
	private int balance;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws OverException {
		if(balance<money) {
			throw new OverException("잔액부족");
		}else {
			balance -= money;
			System.out.println("출금 완료");
		}
	}
	public void transfer(int money,Account account) {
		if(money>0 ) {
		balance -= money;
		account.balance += money;
		System.out.println("이체완료. 이체후 잔액 : " + balance);
		} else {System.out.println("불가");}
		}
	
	public void first() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.생성/2.목록/3.예금/4.출금/5.종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택>");
		}
	}
	


