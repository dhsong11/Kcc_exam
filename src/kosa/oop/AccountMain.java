package kosa.oop;

public class AccountMain {
    public static void main(String[] args) {
        Account account;
        account = new Account();
//
//        account.accountNo = "111-11";
//        account.ownerName = "홍길동";
//        account.balance = 10000;
        
        account.deposit(5000);
        
//        System.out.println("계좌번호: " + account.accountNo);
//        System.out.println("계좌주: " + account.ownerName);
//        System.out.println("잔액: " + account.balance);
    
    

        try {
            account.withdraw(13000); // 출금한 금액을 변수에 저장
        } catch (Exception e) {
            e.printStackTrace();
        }
//        
//        System.out.println("계좌번호: " + account.accountNo);
//        System.out.println("계좌주: " + account.ownerName);
//        System.out.println("잔액: " + account.balance);
        
//        account = new Account("111-11", "송",1234.4);
//        System.out.println(account.balance);
        

       
}
}

