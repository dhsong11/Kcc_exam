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
//      while(true) { //4���� ������ ������ ���ѹݺ�
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
//            System.out.print(">�˻� �̸�:");
//            String searchName = sc.nextLine();
//            PhoneInfo p = manager.search(searchName);
//            if(p == null)
//               System.out.println("�����ϴ�");
//            else
//               p.printPhoneInfo();
//            break;
//            
//         case 4:
//            System.out.println("���α׷� ����");
//            return;
//         }
//      }      
//   }
//
//   private static void showMenu() {
//      System.out.println(">1.�߰� 2.��ü��� 3.�˻� 4.����");
//      System.out.print(">�޴�: ");
//   }
//   
//}
//
//