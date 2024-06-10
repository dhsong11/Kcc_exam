package kosa.phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import kosa.data.Person;

public class Manager {
	static Scanner sc = new Scanner(System.in);
	static List<PhoneInfo> phoneInfos = new ArrayList<>();
//main�޼����
	public static void addPhoneInfo() {

		System.out.println("1.�Ϲ� 2.ȸ�� 3.��â");
		String menu = sc.nextLine();

		switch (menu) {
		case "1":

			System.out.print(">�̸�: ");
			String name = sc.nextLine();
			System.out.print(">��ȭ��ȣ: ");
			String phoneNo = sc.nextLine();
			System.out.print(">�������: ");
			String birth = sc.nextLine();

			PhoneInfo p = new PhoneInfo(name, phoneNo, birth);
			phoneInfos.add(p);

			break;

		case "2":
			System.out.print(">�̸�: ");
			String nameCompany = sc.nextLine();
			System.out.print(">��ȭ��ȣ: ");
			String phoneNoCompany = sc.nextLine();
			System.out.print(">�������: ");
			String birthCompany = sc.nextLine();
			System.out.print(">�μ�: ");
			String dept = sc.nextLine();
			System.out.print(">��å: ");
			String position = sc.nextLine();

			CompanyInfo c = new CompanyInfo(nameCompany, phoneNoCompany, birthCompany, dept, position);
			phoneInfos.add(c);

			break;

		case "3":
			System.out.print(">�̸� : ");
			String nameUniverse = sc.nextLine();
			System.out.print(">��ȭ��ȣ : ");
			String phoneNoUniverse = sc.nextLine();
			System.out.print(">������� : ");
			String birthUniverse = sc.nextLine();
			System.out.print(">�а� : ");
			String major = sc.nextLine();
			System.out.print(">�г� : ");
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
			System.out.println(p.getName() + "�Դϴ�.");
			System.out.println(p.getPhoneNo() + "�Դϴ�.");
			System.out.println(p.getBirth() + "�Դϴ�.");
		}
	}

	public static void update() {
		System.out.print("�̸��� �Է����ּ���: ");
		String name = sc.nextLine();

		for (PhoneInfo info : phoneInfos) {
			if (info.getName().equals(name)) {
				System.out.println("��ȭ��ȣ�� �������ּ���: ");
				String phone_num = sc.nextLine();
				info.setPhoneNo(phone_num);
			} else {

			}

		}
	}

	public static void delete() {
		System.out.println("������ ��ȭ��ȣ�� �̸��� �Է����ּ���: ");
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
		System.out.println("������ ������ ����: ");
		
	}
}