package kosa.car;

import kosa.repository.CarRepository;
import kosa.reservation.ReservationAction;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarAction {

    private static Scanner sc = new Scanner(System.in);
    private List<Car> reservationCompleteCar;
    private static final CarRepository carRepository = new CarRepository();


    public List<Car> getCarsByStatus(CarStatus status){
        setReservationCompleteCar();
        return reservationCompleteCar.stream()
                .filter(c -> c.getCarStatus().equals(status))
                .collect(Collectors.toList());
    }
    public void changeStatus(Long carId, CarStatus status){
        Car findCar = carRepository.findById(carId);
        findCar.setCarStatus(status);
    }

    public void setReservationCompleteCar() {
        ReservationAction reservationAction = new ReservationAction();
        reservationCompleteCar = reservationAction.getCompleteReservation().stream().map(r -> r.getCar()).collect(Collectors.toList());

    }
}
