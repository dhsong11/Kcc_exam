package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CheckingAccount ca = new CheckingAccount("111-111","ȫ�浿",10000,"222-222");
//
//		try {
//			ca.pay("222-222", 30000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(ca.getBalance());
	
		Account arr[] = {
			new Account("111-111","ȫ�浿",100000),
			new CheckingAccount("111-111","ȫ�浿",10000,"222-222"),
			new MinusAccount("333-333","��浿",30000,20000)
		};
	
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] instanceof CheckingAccount) {
			try {
				((CheckingAccount)arr[i]).pay("22-222",5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	System.out.println(arr[1].getBalance());
		
		
		
//		Account ca = new CheckingAccount("111-111","ȫ�浿",10000,"222-222");
//		
//		CheckingAccount obj = (CheckingAccount)ca;//���� ����ȯ 
//		
//		try {
//			obj.pay("222-222",1000);//�θ�� ����ȯ �� �ڽŸ��� ������ �ִ� �޼ҵ�� �� �̻� ���� X
//		}catch(Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	
//	
//	}
		System.out.println("done");

}
}
