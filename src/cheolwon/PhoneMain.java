//package cheolwon;
//
//import java.util.Scanner;
//
//
//
//public class PhoneMain {
//
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      Manager manager = new Manager();
//      
//      while(true) { //4번을 누르기 전까지 무한반복
//         showMenu();
//         int menu = Integer.parseInt(sc.nextLine());
//         
//         switch(menu) {
//         case 1:
//            manager.addPhoneInfo();
//            break;
//            
//         case 2:
//            manager.listPhoneInfo();
//            break;
//   
//         case 3:
//            System.out.print(">검색 이름:");
//            String searchName = sc.nextLine();
//            PhoneInfo p = manager.search(searchName);
//            if(p == null)
//               System.out.println("없습니다");
//            else
//               p.printPhoneInfo();
//            break;
//            
//         case 4:
//            System.out.println("프로그램 종료");
//            return;
//         }
//      }      
//   }
//
//   private static void showMenu() {
//      System.out.println(">1.추가 2.전체출력 3.검색 4.종료");
//      System.out.print(">메뉴: ");
//   }
//   
//}
//
//
