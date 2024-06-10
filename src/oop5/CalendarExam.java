package oop5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {

//		GregorianCalendar gc = new GregorianCalendar();
//		��¥ ��ü		
		Calendar gc = Calendar.getInstance();
		System.out.println(gc);

		String now = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� " + gc.get(Calendar.DATE) + "�� "
				+ gc.get(Calendar.HOUR) + "�� " + gc.get(Calendar.MINUTE) + "��";

		System.out.println("����ð�: " + now);

		// ��¥ �߰�
		gc.add(Calendar.DATE, 100);
		String future = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� " + gc.get(Calendar.DATE)
				+ "�� " + gc.get(Calendar.HOUR) + "�� " + gc.get(Calendar.MINUTE) + "��";

		System.out.println("100�� ��: " + future);

		// ��¥ ����
		gc.set(2022, 5, 4);
		gc.add(Calendar.DATE, 1000);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);

		
	}

}
