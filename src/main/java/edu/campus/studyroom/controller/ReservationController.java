package edu.campus.studyroom.controller;
import edu.campus.studyroom.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ReservationController {
    private final ReservationService service;
    public ReservationController(ReservationService service){this.service=service;}
    @GetMapping("/reservations")
    public String list(Model model){
        model.addAttribute("reservations",service.findAll());
        return "reservations/list";
    }
    // TODO
}
