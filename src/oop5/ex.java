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
//	        // 생일의 월과 일 설정 (월은 0부터 시작)
//	        int birthMonth = 5; // 6월
//	        int birthDay = 4;   // 4일
//
//	        for (int year = startYear; year <= endYear; year++) {
//	            Calendar cal = Calendar.getInstance();
//	            cal.set(year, birthMonth, birthDay);
//	            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//
//	            // 요일 출력
//	            String weekday = "";
//	            switch (dayOfWeek) {
//	                case Calendar.SUNDAY:
//	                    weekday = "일요일";
//	                    break;
//	                case Calendar.MONDAY:
//	                    weekday = "월요일";
//	                    break;
//	                case Calendar.TUESDAY:
//	                    weekday = "화요일";
//	                    break;
//	                case Calendar.WEDNESDAY:
//	                    weekday = "수요일";
//	                    break;
//	                case Calendar.THURSDAY:
//	                    weekday = "목요일";
//	                    break;
//	                case Calendar.FRIDAY:
//	                    weekday = "금요일";
//	                    break;
//	                case Calendar.SATURDAY:
//	                    weekday = "토요일";
//	                    break;
//	            }
//
//	            System.out.println(year + "년: " + weekday);
//	        }
//	    }
