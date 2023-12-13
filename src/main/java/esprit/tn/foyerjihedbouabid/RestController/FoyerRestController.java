package esprit.tn.foyerjihedbouabid.RestController;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Foyer;
import esprit.tn.foyerjihedbouabid.Services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService iFoyerService;


    @GetMapping("getAllFoyers")
    public List<Foyer> getAll(){
        return iFoyerService.findAllFoyers();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addFoyer")
    public Foyer addFoyer(@RequestBody Foyer b ){
        return iFoyerService.addFoyer(b);
    }
    @GetMapping("getFoyerById")
    public Foyer getById(@RequestParam long id){
        return iFoyerService.findFoyerById(id);
    }
    @PostMapping("addAllFoyers")
    public List<Foyer> addAllFoyers(@RequestBody  List <Foyer> Foyers){
        return iFoyerService.addAllFoyers(Foyers);
    }
}
