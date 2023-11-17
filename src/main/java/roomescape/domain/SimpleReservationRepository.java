package roomescape.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class SimpleReservationRepository {

    private AtomicLong index = new AtomicLong(0);

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation save(final Reservation reservation) {
        final Reservation savedReservation = new Reservation(index.incrementAndGet(), reservation.getName(), reservation.getDate(), reservation.getTime());
        reservations.add(savedReservation);
        return savedReservation;
    }

    public List<Reservation> findAll() {
        return reservations;
    }

    public void delete(final Long id) {
        final Reservation reservation = findById(id);
        reservations.remove(reservation);
    }

    public Reservation findById(final Long id) {
        return reservations.stream()
                .filter(reservation -> reservation.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}