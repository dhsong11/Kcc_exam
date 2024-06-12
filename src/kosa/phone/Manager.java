package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	static Scanner sc = new Scanner(System.in);
	static List<PhoneInfo> phoneInfos = new ArrayList<>();
//main메서드오
	public static void addPhoneInfo() {

		System.out.println("1.일반 2.회사 3.동창");
		String menu = sc.nextLine();

		switch (menu) {
		case "1":

			System.out.print(">이름: ");
			String name = sc.nextLine();
			System.out.print(">전화번호: ");
			String phoneNo = sc.nextLine();
			System.out.print(">생년월일: ");
			String birth = sc.nextLine();

			PhoneInfo p = new PhoneInfo(name, phoneNo, birth);
			phoneInfos.add(p);

			break;

		case "2":
			System.out.print(">이름: ");
			String nameCompany = sc.nextLine();
			System.out.print(">전화번호: ");
			String phoneNoCompany = sc.nextLine();
			System.out.print(">생년월일: ");
			String birthCompany = sc.nextLine();
			System.out.print(">부서: ");
			String dept = sc.nextLine();
			System.out.print(">직책: ");
			String position = sc.nextLine();

			CompanyInfo c = new CompanyInfo(nameCompany, phoneNoCompany, birthCompany, dept, position);
			phoneInfos.add(c);

			break;

		case "3":
			System.out.print(">이름 : ");
			String nameUniverse = sc.nextLine();
			System.out.print(">전화번호 : ");
			String phoneNoUniverse = sc.nextLine();
			System.out.print(">생년월일 : ");
			String birthUniverse = sc.nextLine();
			System.out.print(">학과 : ");
			String major = sc.nextLine();
			System.out.print(">학년 : ");
			String year = sc.nextLine();

			UniverseInfo u = new UniverseInfo(nameUniverse, phoneNoUniverse, birthUniverse, major, year);
			phoneInfos.add(u);

			break;
			
		
		}
	}

	public static void listPhoneInfo() {
//		for (PhoneInfo info : phoneInfos) {
//			info.printPhoneInfo();
//		}

		Iterator<PhoneInfo> iter = phoneInfos.iterator();
		while (iter.hasNext()) {
			PhoneInfo p = iter.next();
			System.out.println(p.getName() + "입니다.");
			System.out.println(p.getPhoneNo() + "입니다.");
			System.out.println(p.getBirth() + "입니다.");
		}
	}

	public static void update() {
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();

		for (PhoneInfo info : phoneInfos) {
			if (info.getName().equals(name)) {
				System.out.println("전화번호를 변경해주세요: ");
				String phone_num = sc.nextLine();
				info.setPhoneNo(phone_num);
			} else {

			}

		}
	}

	public static void delete() {
		System.out.println("삭제할 전화번호의 이름을 입력해주세요: ");
		String name = sc.nextLine();

		for (int i = 0; i < phoneInfos.size(); i++) {
			if (phoneInfos.get(i).getName().equals(name)) {
				phoneInfos.remove(i);
			}
		}

	}

	public static PhoneInfo search(String searchName) {
		for (PhoneInfo info : phoneInfos) {
			if (searchName.equals(info.getName())) {
				return info;
			}
		}
		return null;
	}
	
	public static void sort() {
		System.out.println("정렬할 기준을 선택: ");
		
	}
	 
	//저장
	public static void saveToFile() {
        ObjectOutputStream oos = null;
        
        try { 
        	oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));
            oos.writeObject(phoneInfos);
            System.out.println("저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	try {
        		oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
    }

	//불러오기
    public static void loadFromFile() {
    	ObjectInputStream ois = null;
        try {
        	ois = new ObjectInputStream(new FileInputStream("phone.txt"));
            phoneInfos = (List<PhoneInfo>) ois.readObject();
            System.out.println(phoneInfos.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}