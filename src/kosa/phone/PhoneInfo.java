package kosa.phone;

public class PhoneInfo {
   String name;
   String phoneNo;
   String birth;
   
   
   public PhoneInfo() {};
   
   public PhoneInfo(String name, String phoneNo, String birth) {
      this.name = name;
      this.phoneNo = phoneNo;
      this.birth = birth;
   };
   
 
   
   public void printPhoneInfo() {
      System.out.println("�̸� : " + name);
      System.out.println("��ȭ��ȣ : " + phoneNo);
      System.out.println("���� : " + birth);
   }
   

   
   
}