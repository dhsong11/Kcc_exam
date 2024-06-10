package oop5;

import java.util.Calendar;

public class Mission5 {

	public static void main(String[] args) {
//		 달력 만들기
//		<2024년 6월>
//		일 월 화 수 목 금 토 
//		            1
//		2 3 4 5 6 7 8

//		System.out.println("일\t월\t화\t수\t목\t금\t토");
//
//		Calendar gc = Calendar.getInstance();// 오늘 시간 얻기
//
//		int startday = gc.get(Calendar.DAY_OF_WEEK);
//		int lastday = gc.getActualMaximum(Calendar.DATE);// 최대 일수
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
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		Calendar gc = Calendar.getInstance();// 오늘 시간 얻기
		
		
		int lastday = gc.getActualMaximum(Calendar.DATE);// 최대 일수

		
		for (int i = 1; i <= lastday; i++) {
			gc.set(2024, 5, i);
			int day = gc.get(Calendar.DAY_OF_WEEK);
			if(i == 1) { //1일이면 1일에 해당하는 요일만큼 간격을 만들어야함. ex) 1일이 토요일이면 그만큼 간격을 만들어줘야함
				for(int j = 0; j < day -  1; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");

			if (day == 7) { //토요일이라면
				System.out.println();
			}

			
		}



	}

}
