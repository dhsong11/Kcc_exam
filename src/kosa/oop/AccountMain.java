package kosa.oop;

public class AccountMain {
    public static void main(String[] args) {
        Account account;
        account = new Account();
//
//        account.accountNo = "111-11";
//        account.ownerName = "ȫ�浿";
//        account.balance = 10000;
        
        account.deposit(5000);
        
//        System.out.println("���¹�ȣ: " + account.accountNo);
//        System.out.println("������: " + account.ownerName);
//        System.out.println("�ܾ�: " + account.balance);
    
    

        try {
            account.withdraw(13000); // ����� �ݾ��� ������ ����
        } catch (Exception e) {
            e.printStackTrace();
        }
//        
//        System.out.println("���¹�ȣ: " + account.accountNo);
//        System.out.println("������: " + account.ownerName);
//        System.out.println("�ܾ�: " + account.balance);
        
//        account = new Account("111-11", "��",1234.4);
//        System.out.println(account.balance);
        

       
}
}

