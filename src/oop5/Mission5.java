package oop5;

import java.util.Calendar;

public class Mission5 {

	public static void main(String[] args) {
//		 �޷� �����
//		<2024�� 6��>
//		�� �� ȭ �� �� �� �� 
//		            1
//		2 3 4 5 6 7 8

//		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
//
//		Calendar gc = Calendar.getInstance();// ���� �ð� ���
//
//		int startday = gc.get(Calendar.DAY_OF_WEEK);
//		int lastday = gc.getActualMaximum(Calendar.DATE);// �ִ� �ϼ�
//
//		int day = 1;
//		for (int i = 0; i < lastday; i++) {
//			System.out.print(day + "\t");
//
//			if ((day + startday - 1) % 7 == 0) {
//				System.out.println();
//			}
//
//			day++;
//		}
//
//
//		for (int i = 0; i < 7 - (startday + lastday - 1) % 7; i++) {
//			System.out.print("\t");
//		}
//
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		Calendar gc = Calendar.getInstance();// ���� �ð� ���
		
		
		int lastday = gc.getActualMaximum(Calendar.DATE);// �ִ� �ϼ�

		
		for (int i = 1; i <= lastday; i++) {
			gc.set(2024, 5, i);
			int day = gc.get(Calendar.DAY_OF_WEEK);
			if(i == 1) { //1���̸� 1�Ͽ� �ش��ϴ� ���ϸ�ŭ ������ ��������. ex) 1���� ������̸� �׸�ŭ ������ ����������
				for(int j = 0; j < day -  1; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");

			if (day == 7) { //������̶��
				System.out.println();
			}

			
		}



	}

}
