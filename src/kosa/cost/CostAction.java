package kosa.cost;

import kosa.car.Car;
import kosa.car.CarAction;
import kosa.car.CarStatus;
import kosa.repository.CostRepository;
import kosa.reservation.Reservation;
import kosa.reservation.ReservationAction;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CostAction {

    private static Scanner sc = new Scanner(System.in);
    private CarAction carAction = new CarAction();
    private ReservationAction reservationAction  = new ReservationAction();
    private static final CostRepository costRepository = new CostRepository();

    public void rotateAllRepairedCar(CostPolicy policy){
        List<Car> cars = carAction.getCarsByStatus(CarStatus.출고);
        for (Car repairedCar : cars) {
            Optional<Reservation> reservation = reservationAction.getReservationByCarNum(repairedCar.getCarNum());
            if(reservation.isPresent()){
                Cost cost = new Cost(reservation.get());
                cost.calculateAmount(policy, repairedCar);
                repairedCar.setCarStatus(CarStatus.완료);
                costRepository.save(cost);
            }
        }
    }



    public void showCostByStatus(CostStatus status){
        System.out.println("영수증 " + status + "내역입니다.");
        getCostsByStatus(status).forEach(Cost::show);
    }


    public List<Cost> getCostsByStatus(CostStatus status){
        return costRepository.findAll().stream()
                .filter(c -> c.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public void changeStatus(Long costId, int amount){
        Cost changeCost = costRepository.findById(costId);
        changeCost.setAmount(amount);
        changeCost.getReservation().getCar().setCarStatus(CarStatus.완료);
        changeCost.setStatus(CostStatus.처리);
    }

}
