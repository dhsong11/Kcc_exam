package kosa.oop;

public class Account {
     private String accountNo;   
     private String ownerName; 
     private double balance; // double 타입으로 변경
    
    public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 매개변수가 있는 생성자
    Account(String accountNo, String ownerName, int balance) { 
        this.accountNo = accountNo; 
        this.ownerName = ownerName;  
        this.balance = balance;       
    }

    // 매개변수가 없는 기본 생성자 추가
    Account() {
        // 기본 생성자에서는 초기화 작업을 수행하지 않아도 됩니다.
        // 필요한 경우, 이곳에 초기화 코드를 추가할 수 있습니다.
    }
    
    // deposit, withdraw 메서드는 그대로입니다.
    void deposit(double amount)  {  
        balance += amount;
    }
    
    double withdraw(double amount)  throws Exception  {
        if (balance < amount)                 
            throw new Exception("잔액이 부족합니다.");  
        balance -= amount;
        return amount;
    }
}
