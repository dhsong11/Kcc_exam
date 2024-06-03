package kosa.oop;

public class Account {
     private String accountNo;   
     private String ownerName; 
     private double balance; // double Ÿ������ ����
    
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

	// �Ű������� �ִ� ������
    Account(String accountNo, String ownerName, int balance) { 
        this.accountNo = accountNo; 
        this.ownerName = ownerName;  
        this.balance = balance;       
    }

    // �Ű������� ���� �⺻ ������ �߰�
    Account() {
        // �⺻ �����ڿ����� �ʱ�ȭ �۾��� �������� �ʾƵ� �˴ϴ�.
        // �ʿ��� ���, �̰��� �ʱ�ȭ �ڵ带 �߰��� �� �ֽ��ϴ�.
    }
    
    // deposit, withdraw �޼���� �״���Դϴ�.
    void deposit(double amount)  {  
        balance += amount;
    }
    
    double withdraw(double amount)  throws Exception  {
        if (balance < amount)                 
            throw new Exception("�ܾ��� �����մϴ�.");  
        balance -= amount;
        return amount;
    }
}
