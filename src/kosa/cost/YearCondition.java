package kosa.cost;

import kosa.car.Car;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class YearCondition implements GuaranteeCondition{
    @Override
    public boolean isSatisfiedBy(Car car) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime registerYear = car.getRegisterYear();

        long monthsGap = registerYear.until(now, ChronoUnit.MONTHS);

        return 0 <= monthsGap && monthsGap <= 24;
    }
}
