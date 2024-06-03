package kosa.oop;

import java.util.Scanner;

public class Manager {
   
   static PhoneInfo[] phoneInfos = new PhoneInfo[2]; //�迭 ũ�� ���� 10
   static int idx = 0;
   
   public static void addPhoneInfo() {
      Scanner sc = new Scanner(System.in);
      
      System.out.print(">�̸� : ");
      String name = sc.nextLine();
      System.out.print(">��ȭ��ȣ : ");
      String phoneNo = sc.nextLine();
      System.out.print(">������� : ");
      String birth = sc.nextLine();
      
      PhoneInfo p = new PhoneInfo(name, phoneNo, birth);
      
      try {
         phoneInfos[idx++] = p;
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("����ϴ� �迭�� ũ�⸦ �ʰ��߽��ϴ�");
         idx--; //���� ��ü �迭�� ����Ҷ� ���ܸ� �߻���Ű�� �ʱ� ����. 
            
         //System.out.println("���α׷� ����");
         //return;
      }
   }
   
   public static void listPhoneInfo() {
      for(int i = 0; i < idx; i++) {
         phoneInfos[i].printPhoneInfo();
      }
   }
   
   public static PhoneInfo search(String searchName) {
      for(int i = 0; i < idx; i++) {
         if(searchName.equals(phoneInfos[i].name)) {
            return phoneInfos[i];
         }   
      }
      return null;
   }
}