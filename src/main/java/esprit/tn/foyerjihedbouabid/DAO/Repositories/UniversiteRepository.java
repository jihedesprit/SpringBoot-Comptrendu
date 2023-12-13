package esprit.tn.foyerjihedbouabid.DAO.Repositories;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
   // 1- Recherche par nom et prénom de l'étudiant
   List<Universite> findAllByNomAndPrenom(String nom, String prenom);
     //       2- Recherche par CIN de l'étudiant
     Universite findByCin(String cin);
    //     3- Recherche des étudiants par date de naissance après une certaine date
    List<Universite> findAllByDateNaissanceAfter(Date dateNaissance);
// 4- Recherche des étudiants par nom d'école
List<Universite> findAllByEcoleNom(String ecoleNom);
    //        5- Recherche des étudiants par réservation (id de réservation)

    List<Universite> findAllByReservationId(String reservationId);
    //6- Recherche des étudiants par réservation (année de réservation)
    List<Universite> findAllByReservationAnnee(Integer reservationAnnee);
//7- Recherche des étudiants par nom d'école et date de naissance après une certaine date
List<Universite> findAllByEcoleNomAndDateNaissanceAfter(String ecoleNom, Date dateNaissance);
//    8 -Afficher la liste des universités qui ont des étudiants dont leurs noms contiennet la chaine de caractère en paramètre et leurs dates de naissance entre deux dates passées en paramètre

}
