package esprit.tn.foyerjihedbouabid.DAO.Repositories;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    //1- Recherche par numéro de chambre
    public Chambre findByNumeroChambre(String numeroChambre);
//2- Recherche par type de chambre
List<Chambre> findAllByTypeChambre(String typeChambre);
//3- Recherche des chambres par bloc
    List<Chambre> findAllByBloc(String bloc);
//4- Recherche des chambres par bloc et type de chambre
     List<Chambre> findAllByBlocAndTypeChambre(String bloc, String typeChambre);


//5- Recherche des chambres par numéro de chambre et type de chambre
 List<Chambre> findAllByNumeroChambreAndTypeChambre(String numeroChambre, String typeChambre);
//6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer, l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre
 List<Chambre> findAllByUniversiteNomAndReservationAnneeAndReservationEtudiantNomAndNumeroChambre(String universiteNom, Integer reservationAnnee, String reservationEtudiantNom, String numeroChambre);
}
