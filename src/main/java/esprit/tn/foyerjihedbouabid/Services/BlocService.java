package esprit.tn.foyerjihedbouabid.Services;

import esprit.tn.foyerjihedbouabid.DAO.Repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service //definir que c'est un bean Spring
@AllArgsConstructor //Pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService{
    BlocRepository blocRepository;

}
