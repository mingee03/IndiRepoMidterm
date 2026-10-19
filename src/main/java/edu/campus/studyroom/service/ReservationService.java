package edu.campus.studyroom.service;
import edu.campus.studyroom.model.Reservation;
import edu.campus.studyroom.repository.MemoryReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ReservationService {
    private final MemoryReservationRepository repository;
    public ReservationService(MemoryReservationRepository repository){this.repository=repository;}
    public List<Reservation> findAll(){
        // TODO
        return repository.initialList();
    }
    // TODO
}
