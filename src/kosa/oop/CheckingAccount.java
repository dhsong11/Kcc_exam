package kosa.oop;

public class CheckingAccount extends Account {

	private String cardNo;//카드 번호
	
	public CheckingAccount() {}
	
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);//부모생성자호출
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount)throws Exception {
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결재불능");
		}
		return (int)withdraw(amount);
	}



}
