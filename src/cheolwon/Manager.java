//package cheolwon;
//
//import java.util.Scanner;
//
//public class Manager {
//
//	private static final String p = null;
//	static PhoneInfo[] phoneInfos = new PhoneInfo[10]; // �迭 ũ�� ���� 10
//	static int idx = 0;
//
//	public static void addPhoneInfo() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("1.�Ϲ� 2.ȸ�� 3.��â");
//		String menu = sc.nextLine();
//
//		System.out.print(">�̸� : ");
//		String name = sc.nextLine();
//		System.out.print(">��ȭ��ȣ : ");
//		String phoneNo = sc.nextLine();
//		System.out.print(">������� : ");
//		String birth = sc.nextLine();
//
//		switch (menu) {
//		case "1":
//
//			PhoneInfo p = new PhoneInfo(name, phoneNo, birth);
//			phoneInfos[idx++] = p;
//			break;
//
//		case "2":
//			System.out.print(">�μ� : ");
//			String dept = sc.nextLine();
//			System.out.print(">��å : ");
//			String position = sc.nextLine();
//			CompanyInfo c = new CompanyInfo(name, phoneNo, birth, dept, position);
//			phoneInfos[idx++] = c;
//			break;
//
//		case "3":
//			System.out.print(">�а� : ");
//			String major = sc.nextLine();
//			System.out.print(">�г� : ");
//			String year = sc.nextLine();
//			UniverseInfo u = new UniverseInfo(name, phoneNo, birth, major, year);
//			phoneInfos[idx++] = u;
//			break;
//		}
//
//				
//
//		
//	}
//
//	public static void listPhoneInfo() {
//		for (int i = 0; i < idx; i++) {
//			phoneInfos[i].printPhoneInfo();
//		}
//	}
//
//	public static PhoneInfo search(String searchName) {
//		for (int i = 0; i < idx; i++) {
//			if (searchName.equals(phoneInfos[i].name)) {
//				return phoneInfos[i];
//			}
//		}
//		return null;
//	}
//}