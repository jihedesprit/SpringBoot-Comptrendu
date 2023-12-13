package esprit.tn.foyerjihedbouabid.DAO.Repositories;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc(String nomBloc);
    Bloc getByNomBloc(String nomBloc);
    Bloc getByCapaciteBloc(long capaciteBloc);
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc,long capaciteBloc);
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc,long capaciteBloc);
    Bloc findByNomBlocIgnoreCase(String nom);
    Bloc findByCapaciteBlocGreaterThan(int valeur);
    Bloc findByOrderByNomBloc();
    Bloc findByFoyerNomFoyer(String nomFoyer);

}
