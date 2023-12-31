package esprit.tn.foyerjihedbouabid.RestController;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Reservation;
import esprit.tn.foyerjihedbouabid.Services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;


    @GetMapping("getAllReservations")
    public List<Reservation> getAll(){
        return iReservationService.findAllReservations();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addReservation")
    public Reservation addReservation(@RequestBody Reservation b ){
        return iReservationService.addReservation(b);
    }
    @GetMapping("getReservationById")
    public Reservation getById(@RequestParam String id){
        return iReservationService.findReservationById(id);
    }
    @PostMapping("addAllReservations")
    public List<Reservation> addAllReservations(@RequestBody  List <Reservation> Reservations){
        return iReservationService.addAllReservations(Reservations);
    }
}
