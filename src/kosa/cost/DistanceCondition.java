package kosa.cost;

import kosa.car.Car;

import java.time.LocalDateTime;

public class DistanceCondition implements GuaranteeCondition{

    @Override
    public boolean isSatisfiedBy(Car car) {
        int distance = car.getDistance();
        return distance <= 40000;
    }
}
