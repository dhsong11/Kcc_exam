package kosa.cost;

import kosa.car.Car;

import java.util.ArrayList;
import java.util.List;

public class CostPolicy {
    private final List<GuaranteeCondition> conditions;

    public CostPolicy(GuaranteeCondition ... conditions) {
        this.conditions = List.of(conditions);
    }

    public boolean isGuarantee(Car car){
        for (GuaranteeCondition condition : conditions) {
            if(condition.isSatisfiedBy(car)){
                return true;
            }
        }
        return false;
    }
}
