package esprit.tn.foyerjihedbouabid.DAO.Repositories;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Foyer;
import esprit.tn.foyerjihedbouabid.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    Foyer findByNomFoyer(String nom);
    List<Foyer> findByCapaciteFoyerGreaterThan(int capacite);
    List<Foyer> findByCapaciteFoyerLessThan(int capacite);
    List<Foyer> findByCapaciteFoyerBetween(int min,int max);
    Foyer findByUniversiteNomUniversite(String nom);
    List<Foyer> getByBlocsChambresChambre(TypeChambre typeChambre);

//1- Recherche des foyers d'un bloc spécifique
    List<Foyer> findByBlocIdBloc(int idBloc);
    //          2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findByBlocIdBlocAndIdFoyer(int idBloc, long idFoyer);
    //3- Recherche des foyers d'un bloc ayant une capacité spécifique
    List<Foyer> findByBlocIdBlocAndCapaciteFoyer(int idBloc, int capacite);
    //          4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findByBlocIdBlocAndUniversiteNomUniversite(int idBloc, String nomUniversite);

}
