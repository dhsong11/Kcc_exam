package kosa.cost;

import kosa.car.Car;
import kosa.customer.Customer;
import kosa.reservation.Reservation;

public class Cost {
    private Long costId;
    private Reservation reservation;
    private int amount;
    private CostStatus status = CostStatus.미처리;

    public Cost(Reservation reservation){
        this.reservation = reservation;
    }

    public void calculateAmount(CostPolicy costPolicy, Car car){
         if (costPolicy.isGuarantee(car)){
             status = CostStatus.처리;
             amount = 0;
         }
    }

    public void show(){
        System.out.println(costId);
        System.out.println("고객명 : " + reservation.getCustomer().getName());
        System.out.println("예약내용 " + reservation.getWhat() );
        System.out.println("금액 : " + amount);
    }

    public Reservation getReservation() {
        return reservation;
    }

    public CostStatus getStatus() {
        return status;
    }

    public void setStatus(CostStatus status) {
        this.status = status;
    }

    public Long getCostId() {
        return costId;
    }

    public void setCostId(Long costId) {
        this.costId = costId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
