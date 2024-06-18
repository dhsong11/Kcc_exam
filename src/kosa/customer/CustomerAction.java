package kosa.customer;

import kosa.api.CarInfo;
import kosa.car.Car;
import kosa.repository.CarRepository;
import kosa.repository.CustomerRepository;
import kosa.repository.ReservationRepository;
import kosa.reservation.Reservation;
import kosa.reservation.ReservationAction;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerAction {

    private static Scanner sc = new Scanner(System.in);
    private static final CustomerRepository customerRepository = new CustomerRepository();
    private static final CarRepository carRepository = new CarRepository();
    private static final ReservationRepository reservationRepository = new ReservationRepository();

    public Customer createCustomer(){
        System.out.print(">고객명 : ");
        String name = sc.nextLine();

        String phoneNum;
        do {
           System.out.print(">고객번호 : ");
           phoneNum = sc.nextLine();
        } while (!validatePhoneNumber(phoneNum));

        System.out.print(">고객주소 : ");
        String address = sc.nextLine();

        System.out.print(">챠랑번호 : ");
        String carNum = sc.nextLine();

        Car car = CarInfo.getCarInfo(carNum);
        carRepository.save(car);

        Customer newCustomer = new Customer(name, phoneNum, address, car);

        customerRepository.save(newCustomer);

        return newCustomer;
    }


    public void reserve(){
        Customer customer = createCustomer();
        ReservationAction reservationAction = new ReservationAction();
        reservationAction.createReservation(customer, null);
    }


    public void getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        printMenu();
        for (Customer customer : customers) {
            customer.printCustomer();
        }
    }

    public void getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        LocalDate now = LocalDate.now();
        System.out.println("[ 오늘의 예약 현황 ]");
        Reservation.printMenu();
        for (Reservation reservation : reservations) {
            String reservationDate = String.valueOf(reservation.getWhen()).substring(0, 10);
            String nowDate = String.valueOf(now);
            if ( reservationDate.equals(nowDate) ) {
                reservation.printReservation();
            }
        }
    }


    private boolean validatePhoneNumber(String phoneNum){
        String phoneRegex = "^(01[016789]{1})-?[0-9]{3,4}-?[0-9]{4}$";
        if(!Pattern.matches(phoneRegex, phoneNum)){
            System.out.println("휴대폰 번호 형식이 안맞습니다");
            return false;
        }
        return true;
    }


    private void printMenu() {
        System.out.println("이름" + "\t\t\t" + "휴대폰번호" + "\t\t\t" + "주소" + "\t\t\t\t\t\t\t " + "차량번호");
        System.out.println("--------------------------------------------------------------------");
    }


}
