package edu.campus.studyroom.repository;
import edu.campus.studyroom.model.Reservation;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class MemoryReservationRepository {
    private final Map<Long,Reservation> reservations = new LinkedHashMap<>();
    private long sequence=0L;
    public MemoryReservationRepository() {
        save(new Reservation(null,"김학생","A-201",2,false));
        save(new Reservation(null,"이학생","B-102",4,true));
        save(new Reservation(null,"박학생","A-201",1,false));
        save(new Reservation(null,"최학생","C-303",3,false));
    }
    public Reservation save(Reservation reservation) {
        if(reservation.getId()==null) reservation.setId(++sequence);
        else sequence=Math.max(sequence,reservation.getId());
        reservations.put(reservation.getId(),reservation);
        return reservation;
    }
    public Optional<Reservation> findById(Long id) {
        // TODO
        return Optional.ofNullable(reservations.get(id));
    }
    public List<Reservation> findAll() {
        // TODO
        return new ArrayList<>(reservations.values());
    }
    public List<Reservation> initialList() { return new ArrayList<>(reservations.values()); }
}
