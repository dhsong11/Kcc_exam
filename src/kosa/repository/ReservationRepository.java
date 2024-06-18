package kosa.repository;

import kosa.reservation.Reservation;
import kosa.reservation.ReservationStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReservationRepository {
    private static final Map<Long, Reservation> store = new HashMap<>();
    private static long sequence = 0L;
    public Reservation findById(Long id){
         return store.get(id);
    }

    public Reservation save(Reservation reservation){
        reservation.setReservationId(++sequence);
        store.put(reservation.getReservationId(), reservation);
        return reservation;
    }

    public List<Reservation> findAll(){
        return store.values().stream().collect(Collectors.toList());
    }

    public List<Reservation> findByManagerName(String name){
         return store.values().stream()
                 .filter(r -> r.getManager().isPresent())
                 .filter(r -> r.getManager().get().getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<Reservation> findReadyReservation(){
        return store.values().stream().
                filter(r -> r.getStatus().equals(ReservationStatus.READY)).
                collect(Collectors.toList());
    }

    public List<Reservation> findCompleteReservation(){
        return store.values().stream().
                filter(r -> r.getStatus().equals(ReservationStatus.COMPLETE)).
                collect(Collectors.toList());
    }

    public Optional<Reservation> findByCarNumber(String carNumber){
        return store.values().stream()
                .filter(r -> r.getCar().getCarNum().equals(carNumber))
                .filter(r -> r.getStatus().equals(ReservationStatus.COMPLETE))
                .findFirst();
    }
}
