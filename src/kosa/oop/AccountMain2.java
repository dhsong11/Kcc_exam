package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CheckingAccount ca = new CheckingAccount("111-111","홍길동",10000,"222-222");
//
//		try {
//			ca.pay("222-222", 30000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(ca.getBalance());
	
		Account arr[] = {
			new Account("111-111","홍길동",100000),
			new CheckingAccount("111-111","홍길동",10000,"222-222"),
			new MinusAccount("333-333","김길동",30000,20000)
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
		
		
		
//		Account ca = new CheckingAccount("111-111","홍길동",10000,"222-222");
//		
//		CheckingAccount obj = (CheckingAccount)ca;//강제 형변환 
//		
//		try {
//			obj.pay("222-222",1000);//부모로 형변환 후 자신만이 가지고 있는 메소드는 더 이상 접근 X
//		}catch(Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	
//	
//	}
		System.out.println("done");

}
}
