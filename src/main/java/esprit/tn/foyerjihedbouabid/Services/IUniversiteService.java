package esprit.tn.foyerjihedbouabid.Services;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite b);


    List<Universite> addAllUniversites(List<Universite> universites);

    Universite updateUniversite(Universite b);

    List<Universite> updateAllUniversites(List<Universite> universites);

    List<Universite> findAllUniversites();

    Universite findUniversiteById(long id);

    void deleteUniversite(Universite b);

    void deleteUniversiteById(long id);
}
