//package oop5;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Scanner;
//
//public class DateMission {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String pattern = "yyyy/MM/dd";
//		DateFormat df = new SimpleDateFormat(pattern);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력: ");
//		
//		Date inDate = null;
//		
//		while(sc.hasNextLine()) {
//			try {
////				inDate = df.parse(sc.nextLine());
//				break;
//			}catch(Exception e) {
//			 System.out.println("다시 입력 하세요.");
//			}
//		}
//		Calendar cal = Calendar.getInstance();//입사일
//		cal.setTime(inDate);
//		Calendar today = Calendar.getInstance();//오늘 날짜 2024
//
//		//총일수
//		long day = (today.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
//		System.out.println(day);
//		
//		int year = (int)(day/365);
//		int month = (int)(day/365) % 12;
//		
//		System.out.println("재직기간: " + year + "년 " + month + "월 근속");
//	}
//
//}
