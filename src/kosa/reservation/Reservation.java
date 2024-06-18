package kosa.reservation;

import kosa.car.Car;
import kosa.customer.Customer;
import kosa.employee.Employee;

import java.time.LocalDateTime;
import java.util.Optional;

public class Reservation implements Comparable<Reservation>{
    private Long reservationId;
    private Customer customer;
    private LocalDateTime when;
    private String what;
    private Optional<Employee> manager;
    private ReservationStatus status;

    public Reservation(Customer customer, LocalDateTime when, Employee manager, String what) {
        this.customer = customer;
        this.when = when;
        this.manager = Optional.ofNullable(manager);
        if(manager != null){
            this.status = ReservationStatus.COMPLETE;
        } else {
            this.status = ReservationStatus.READY;
        }
        this.what = what;
    }

    public Car getCar(){
        return customer.getCar();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void printReservation() {
        String ManagerName = (manager.isPresent()) ? manager.get().getName() : "미정";
        System.out.print(reservationId + "\t\t\t" + customer.getName() + " \t\t\t");
        System.out.print(customer.getPhoneNumber() + "\t\t" + customer.getCar().getCarNum() + "\t\t" );
        System.out.print(when + "\t\t" + what + "\t\t\t" );
        System.out.println(status + "\t\t\t\t" + ManagerName);
    }

    public static void printMenu() {
        System.out.print("예약ID" + "\t\t" + "예약자명" + "\t\t\t" + "예약자번호" + "\t\t\t" + "차량번호" + "\t\t\t");
        System.out.println("예약일자" + "\t\t\t\t\t" + "예약내용" + "\t\t\t\t\t" + "예약상태" + "\t\t\t" + "담당자");
        System.out.print("-----------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
    }

    public LocalDateTime getWhen() {
        return when;
    }

    @Override
    public int compareTo(Reservation r) {
        return this.when.compareTo(r.when);
    }

    public String getWhat() {
        return what;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Optional<Employee> getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = Optional.of(manager);
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
