package kosa.oop;

public class MinusAccount extends Account{
	//�������̵�
		//1. ��Ӱ���
		//2. �޼����� �ñ״�ó(����������, ������, �̸�, �Ķ����)��ġ
		//3. �޼����� ���� ����ġ(������)
		
	private int creditLine; //���̳ʽ� �ѵ�
	public MinusAccount() {}
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

//	@Override
//	double int withdraw(double amount) throws Exception {
//		if(getBalance()+ creditLine < amount) {
//			throw new Exception("�ܾ׺���");
//		}
//		
//		int balance = getBalance();
//		setBalance(balance-amount);
//		
//		return amount;
		
		
	}
	
	
//}
