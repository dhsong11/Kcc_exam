//package oop5;
//
//public class ex {
//
//	import java.util.Calendar;
//
//	public static void main(String[] args) {
//	        int startYear = 2020;
//	        int endYear = 2030;
//
//	        // ������ ���� �� ���� (���� 0���� ����)
//	        int birthMonth = 5; // 6��
//	        int birthDay = 4;   // 4��
//
//	        for (int year = startYear; year <= endYear; year++) {
//	            Calendar cal = Calendar.getInstance();
//	            cal.set(year, birthMonth, birthDay);
//	            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//
//	            // ���� ���
//	            String weekday = "";
//	            switch (dayOfWeek) {
//	                case Calendar.SUNDAY:
//	                    weekday = "�Ͽ���";
//	                    break;
//	                case Calendar.MONDAY:
//	                    weekday = "������";
//	                    break;
//	                case Calendar.TUESDAY:
//	                    weekday = "ȭ����";
//	                    break;
//	                case Calendar.WEDNESDAY:
//	                    weekday = "������";
//	                    break;
//	                case Calendar.THURSDAY:
//	                    weekday = "�����";
//	                    break;
//	                case Calendar.FRIDAY:
//	                    weekday = "�ݿ���";
//	                    break;
//	                case Calendar.SATURDAY:
//	                    weekday = "�����";
//	                    break;
//	            }
//
//	            System.out.println(year + "��: " + weekday);
//	        }
//	    }
