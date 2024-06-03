package kosa.oop;

import java.util.Scanner;

public class Manager {
   
   static PhoneInfo[] phoneInfos = new PhoneInfo[2]; //배열 크기 제한 10
   static int idx = 0;
   
   public static void addPhoneInfo() {
      Scanner sc = new Scanner(System.in);
      
      System.out.print(">이름 : ");
      String name = sc.nextLine();
      System.out.print(">전화번호 : ");
      String phoneNo = sc.nextLine();
      System.out.print(">생년월일 : ");
      String birth = sc.nextLine();
      
      PhoneInfo p = new PhoneInfo(name, phoneNo, birth);
      
      try {
         phoneInfos[idx++] = p;
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("허용하는 배열의 크기를 초과했습니다");
         idx--; //이후 전체 배열을 출력할때 예외를 발생시키지 않기 위함. 
            
         //System.out.println("프로그램 종료");
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