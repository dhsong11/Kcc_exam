//package cheolwon;
//
//import java.util.Scanner;
//
//public class Manager {
//
//	private static final String p = null;
//	static PhoneInfo[] phoneInfos = new PhoneInfo[10]; // 배열 크기 제한 10
//	static int idx = 0;
//
//	public static void addPhoneInfo() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("1.일반 2.회사 3.동창");
//		String menu = sc.nextLine();
//
//		System.out.print(">이름 : ");
//		String name = sc.nextLine();
//		System.out.print(">전화번호 : ");
//		String phoneNo = sc.nextLine();
//		System.out.print(">생년월일 : ");
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
//			System.out.print(">부서 : ");
//			String dept = sc.nextLine();
//			System.out.print(">직책 : ");
//			String position = sc.nextLine();
//			CompanyInfo c = new CompanyInfo(name, phoneNo, birth, dept, position);
//			phoneInfos[idx++] = c;
//			break;
//
//		case "3":
//			System.out.print(">학과 : ");
//			String major = sc.nextLine();
//			System.out.print(">학년 : ");
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