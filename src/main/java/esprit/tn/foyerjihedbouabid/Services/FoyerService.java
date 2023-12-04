package esprit.tn.foyerjihedbouabid.Services;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Foyer;

import esprit.tn.foyerjihedbouabid.DAO.Repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer b) {
        return foyerRepository.save(b);
    }
@Override
    public List<Foyer> addAllFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public Foyer updateFoyer(Foyer b) {
        return foyerRepository.save(b);
    }

    @Override

    public List<Foyer> updateAllFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public List<Foyer> findAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findFoyerById(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteFoyer(Foyer b) {
        foyerRepository.delete(b);
    }

    @Override
    public void deleteFoyerById(long id) {
        foyerRepository.deleteById(id);
    }
}
