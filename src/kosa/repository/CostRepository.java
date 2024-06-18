package kosa.repository;

import kosa.car.Car;
import kosa.cost.Cost;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CostRepository {

    private static final Map<Long, Cost> store = new HashMap<>();
    private static long sequence = 0L;

    public Cost save(Cost cost){
        cost.setCostId(++sequence);
        store.put(cost.getCostId(), cost);
        return cost;
    }

    public List<Cost> findAll(){
        return store.values().stream().collect(Collectors.toList());
    }

    public Cost findById(Long id){
        return store.get(id);
    }


}
