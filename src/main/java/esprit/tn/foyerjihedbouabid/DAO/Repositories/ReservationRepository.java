package esprit.tn.foyerjihedbouabid.DAO.Repositories;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {

    //1- Recherche des réservations validées
     List<Reservation> findAllByValide(boolean valide);
//2- Recherche des réservations par l'id de l'étudiant
List<Reservation> findAllByEtudiantId(String etudiantId);
//3- Recherche des réservations par année et validité
 List<Reservation> findAllByAnneeAndValide(Integer annee, boolean valide);
}
