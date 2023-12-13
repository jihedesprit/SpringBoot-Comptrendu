package esprit.tn.foyerjihedbouabid.DAO.Repositories;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByCin(long cin);
    List<Etudiant> findBynomETLike(String nomEt);
    List<Etudiant> findBynomETContains(String nomEt);
    List<Etudiant> findByNomEtContaining(String nomEt);
}
