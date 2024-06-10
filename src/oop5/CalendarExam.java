package oop5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {

//		GregorianCalendar gc = new GregorianCalendar();
//		날짜 객체		
		Calendar gc = Calendar.getInstance();
		System.out.println(gc);

		String now = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분";

		System.out.println("현재시간: " + now);

		// 날짜 추가
		gc.add(Calendar.DATE, 100);
		String future = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE)
				+ "일 " + gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분";

		System.out.println("100일 후: " + future);

		// 날짜 설정
		gc.set(2022, 5, 4);
		gc.add(Calendar.DATE, 1000);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);

		
	}

}
