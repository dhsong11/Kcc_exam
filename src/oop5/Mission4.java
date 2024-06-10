//package oop5;
//
//import java.util.Calendar;
//
//public class Mission4 {
//
//	public static void main(String[] args) {
//
//		// ����
//		// 2024~2030����� �ڽ��� ������ ���� ����?
//		// Calendar.DAY_OF_WEEK => ����<��(1)��(2)....>
//		char week[] = { '��', '��', 'ȭ', '��', '��', '��', '��', '��' };
//
//		int start = 2024;
//		int end = 2030;
//		Calendar cd = Calendar.getInstance();
//
//		for (int year = start; year <= end; year++) {
//			cd.set(year, 5, 4);// 6��4��
//
//			char c = week[cd.get(Calendar.DAY_OF_WEEK) - 1];
//			System.out.println(year + "���� ������ " + c + "�����Դϴ�.");
//
//		}
//
//	}
//
//}