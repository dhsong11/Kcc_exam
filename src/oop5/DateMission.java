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
//		System.out.print("�Է�: ");
//		
//		Date inDate = null;
//		
//		while(sc.hasNextLine()) {
//			try {
////				inDate = df.parse(sc.nextLine());
//				break;
//			}catch(Exception e) {
//			 System.out.println("�ٽ� �Է� �ϼ���.");
//			}
//		}
//		Calendar cal = Calendar.getInstance();//�Ի���
//		cal.setTime(inDate);
//		Calendar today = Calendar.getInstance();//���� ��¥ 2024
//
//		//���ϼ�
//		long day = (today.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
//		System.out.println(day);
//		
//		int year = (int)(day/365);
//		int month = (int)(day/365) % 12;
//		
//		System.out.println("�����Ⱓ: " + year + "�� " + month + "�� �ټ�");
//	}
//
//}
