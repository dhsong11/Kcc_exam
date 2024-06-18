package kosa.repository;

import kosa.car.Car;

import java.util.HashMap;
import java.util.Map;

public class CarRepository {

    private static final Map<Long, Car> store = new HashMap<>();
    private static long sequence = 0L;

    public Car save(Car car){
        car.setCarId(++sequence);
        store.put(car.getCarId(), car);
        return car;
    }

    public Car findById(Long id){
        return store.get(id);
    }


}
