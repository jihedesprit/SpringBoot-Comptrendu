package esprit.tn.foyerjihedbouabid.Services;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Foyer;

import java.util.List;

public interface IFoyerService {


    Foyer addFoyer(Foyer b);

    List<Foyer> addAllFoyers(List<Foyer> foyers);


    Foyer updateFoyer(Foyer b);

    List<Foyer> updateAllFoyers(List<Foyer> foyers);


    List<Foyer> findAllFoyers();

    Foyer findFoyerById(long id);


    void deleteFoyer(Foyer b);

    void deleteFoyerById(long id);
}
