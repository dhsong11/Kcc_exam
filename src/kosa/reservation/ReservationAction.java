package kosa.reservation;

import kosa.customer.Customer;
import kosa.employee.Employee;
import kosa.repository.ReservationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservationAction {

    private static Scanner sc = new Scanner(System.in);
    private static final ReservationRepository reservationRepository = new ReservationRepository();
    public void createReservation(Customer customer, Employee employee){
        System.out.println(">예약일자 ↓ ");
        String date;
        do {
            System.out.print(">날짜(yyyy/MM/dd) : ");
            date = sc.nextLine();
        } while (!validateReservationDate(date));

        String time;
        do {
            System.out.print(">시간(XX:XX) : ");
            time = sc.nextLine();
        } while (!validateReservationTime(time));


        String[] split = date.split("/");
        String[] split1 = time.split(":");

        LocalDateTime when = LocalDateTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]),
                Integer.parseInt(split[2]), Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));


        System.out.println(">예약내용 ↓ ");
        String what = sc.nextLine();

        reservationRepository.save(new Reservation(customer, when, employee, what));
    }


    private boolean validateReservationDate(String date){
        String datePattern = "^(\\d{4})/(0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|3[01])$";
        Pattern datePa = Pattern.compile(datePattern);
        Matcher dateMat = datePa.matcher(date);
        if (!dateMat.matches()) {
            System.out.println("날짜 형식이 잘못되었습니다. 올바른 형식 = yyyy/MM/dd");
            return false;
        }
        return true;
    }

    private boolean validateReservationTime(String time){
        String timePattern = "^([01][0-9]|2[0-3]):([0-5][0-9])$";
        Pattern timePa = Pattern.compile(timePattern);
        Matcher timeMat = timePa.matcher(time);
        if (!timeMat.matches()) {
            System.out.println("시간 형식이 잘못되었습니다. 올바른 형식 = HH:mm");
            return false;
        }
        return  true;
    }


    public void getAllReservations(){
        printReservation(reservationRepository.findAll());
    }

    public List<Reservation> getCompleteReservation(){
        return reservationRepository.findCompleteReservation();
    }

    public Optional<Reservation> getReservationByCarNum(String carNum){
        return reservationRepository.findByCarNumber(carNum);
    }

    public void filterManagerNameReservation(String managerName) {
        printReservation(reservationRepository.findByManagerName(managerName));
    }

    public void showReadyReservation(){
        printReservation(reservationRepository.findReadyReservation());
    }

    public void showCompleteReservation(){
        printReservation(reservationRepository.findCompleteReservation());
    }

    public void setReadyReservationToComplete(Employee employee){
        showReadyReservation();
        System.out.println("예약완료로 변경할 예약건을 고르세요<ID입력>");
        System.out.print("> 입력 : ");
        Long reservationId = sc.nextLong();
        Reservation findReservation = reservationRepository.findById(reservationId);
        findReservation.setStatus(ReservationStatus.COMPLETE);
        findReservation.setManager(employee);
        System.out.println("변경완료");
        Reservation.printMenu();
        findReservation.printReservation();
    }

    public void cancelReservation(){
        showCompleteReservation();
        System.out.println("예약취소로 변경할 예약건을 고르세요<ID입력>");
        System.out.print("> 입력 : ");
        Long reservationId = sc.nextLong();

        Reservation findReservation = reservationRepository.findById(reservationId);
        findReservation.setStatus(ReservationStatus.CANCEL);
        System.out.println("취소완료");
    }


    public void printReservation(List<Reservation> reservations){
        Reservation.printMenu();
        for (Reservation r : reservations) {
            r.printReservation();
        }
    }
}
