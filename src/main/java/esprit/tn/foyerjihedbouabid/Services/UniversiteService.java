package esprit.tn.foyerjihedbouabid.Services;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Universite;
import esprit.tn.foyerjihedbouabid.DAO.Repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite b) {
        return universiteRepository.save(b);
    }
    @Override
    public List<Universite> addAllUniversites(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public Universite updateUniversite(Universite b) {
        return universiteRepository.save(b);
    }

    @Override

    public List<Universite> updateAllUniversites(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findUniversiteById(long id)
    {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteUniversite(Universite b) {

        universiteRepository.delete(b);
    }

    @Override
    public void deleteUniversiteById(long id) {
        universiteRepository.deleteById(id);
    }
}
