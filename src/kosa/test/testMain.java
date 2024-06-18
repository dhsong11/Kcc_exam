//package test;
//
//import java.time.LocalDateTime;
//import java.util.Scanner;
//
//public class testMain {
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String yearmonthday = sc.nextLine();
//        String[] split = yearmonthday.split("/");
//
//        String hourmin = sc.nextLine();
//        String[] split1 = hourmin.split(":");
//
//        LocalDateTime localDateTime = LocalDateTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]),
//                Integer.parseInt(split[2]), Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));
//
//        System.out.println(localDateTime.toString());
//    }
//}
