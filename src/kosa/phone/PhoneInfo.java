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
      System.out.println("이름 : " + name);
      System.out.println("전화번호 : " + phoneNo);
      System.out.println("생일 : " + birth);
   }
   

   
   
}