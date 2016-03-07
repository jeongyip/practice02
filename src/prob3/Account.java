package prob3;

public class Account {

	private String accountNo; //계좌번호
	private int balance; //잔고
	
	
	Account(String accountNo){
		this.balance = 0;
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	public void deposit(int money){
		System.out.println();
		System.out.println(accountNo+" 계좌에 "+money+"만원이 출금되었습니다.");
		this.balance -= money;
	}
	
	public void save(int money){
		System.out.println();
		System.out.println(accountNo+" 계좌에 "+money+"만원이 입금되었습니다.");
		this.balance += money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
