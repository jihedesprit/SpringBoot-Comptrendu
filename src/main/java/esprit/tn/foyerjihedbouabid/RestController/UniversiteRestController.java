package esprit.tn.foyerjihedbouabid.RestController;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Universite;
import esprit.tn.foyerjihedbouabid.Services.IUniversiteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class UniversiteRestController {
    IUniversiteService iUniversiteService;


    @GetMapping("getAllUniversites")
    public List<Universite> getAll(){
        return iUniversiteService.findAllUniversites();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite b ){
        return iUniversiteService.addUniversite(b);
    }
    @GetMapping("getUniversiteById")
    public Universite getById(@RequestParam long id){
        return iUniversiteService.findUniversiteById(id);
    }
    @PostMapping("addAllUniversites")
    public List<Universite> addAllUniversites(@RequestBody  List <Universite> Universites){
        return iUniversiteService.addAllUniversites(Universites);
    }
}