package kosa.cost;

import kosa.car.Car;

public interface GuaranteeCondition {
    boolean isSatisfiedBy(Car car);
}
