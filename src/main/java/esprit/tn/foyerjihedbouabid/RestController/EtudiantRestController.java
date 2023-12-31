package esprit.tn.foyerjihedbouabid.RestController;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Etudiant;
import esprit.tn.foyerjihedbouabid.Services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService iEtudiantService;


    @GetMapping("getAllEtudiants")
    public List<Etudiant> getAll(){
        return iEtudiantService.findAllEtudiants();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant b ){
        return iEtudiantService.addEtudiant(b);
    }
    @GetMapping("getEtudiantById")
    public Etudiant getById(@RequestParam long id){
        return iEtudiantService.findEtudiantById(id);
    }
    @PostMapping("addAllEtudiants")
    public List<Etudiant> addAllEtudiants(@RequestBody  List <Etudiant> Etudiants){
        return iEtudiantService.addAllEtudiants(Etudiants);
    }
}
